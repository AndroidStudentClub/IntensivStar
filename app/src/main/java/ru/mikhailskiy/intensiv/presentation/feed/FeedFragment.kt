package ru.mikhailskiy.intensiv.presentation.feed

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import androidx.recyclerview.widget.LinearLayoutManager
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import kotlinx.android.synthetic.main.feed_fragment.*
import kotlinx.android.synthetic.main.feed_header.*
import kotlinx.android.synthetic.main.search_toolbar.view.*
import org.koin.android.ext.android.inject
import ru.mikhailskiy.intensiv.BuildConfig
import ru.mikhailskiy.intensiv.R
import ru.mikhailskiy.intensiv.data.repository.TopRatedMoviesRemoteRepository
import ru.mikhailskiy.intensiv.data.vo.Movie
import ru.mikhailskiy.intensiv.domain.usecase.TopRatedMoviesUseCase
import ru.mikhailskiy.intensiv.presentation.afterTextChanged
import timber.log.Timber

class FeedFragment : Fragment(), FeedPresenter.FeedView {

    // Инициализируем через Koin
    private val presenter: FeedPresenter by inject()

    private val adapter by lazy {
        GroupAdapter<GroupieViewHolder>()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.feed_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Добавляем в presenter имплементацию FeedView
        presenter.attachView(this)


        // Добавляем recyclerView
        movies_recycler_view.layoutManager = LinearLayoutManager(context)
        movies_recycler_view.adapter = adapter.apply { addAll(listOf()) }
        search_toolbar.search_edit_text.afterTextChanged {
            Timber.d(it.toString())
            if (it.toString().length > 3) {
                openSearch(it.toString())
            }
        }

        // Вызываем метод presenter для получения фильмов
        presenter.getMovies()

    }

    override fun showMovies(movies: List<Movie>) {
        movies_recycler_view.adapter = adapter.apply {
            addAll(
                listOf(
                    MainCardContainer(
                        title = R.string.main_title,
                        items = movies.map { MovieItem(it, {}) }.toList()
                    )
                )
            )
        }
    }

    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun showEmptyMovies() {

    }

    override fun showError() {

    }

    private fun openMovieDetails(movie: Movie) {
        val options = navOptions {
            anim {
                enter = R.anim.slide_in_right
                exit = R.anim.slide_out_left
                popEnter = R.anim.slide_in_left
                popExit = R.anim.slide_out_right
            }
        }

        val bundle = Bundle()
        bundle.putString("title", movie.title)
        findNavController().navigate(R.id.movie_details_fragment, bundle, options)
    }

    private fun openSearch(searchText: String) {
        val options = navOptions {
            anim {
                enter = R.anim.slide_in_right
                exit = R.anim.slide_out_left
                popEnter = R.anim.slide_in_left
                popExit = R.anim.slide_out_right
            }
        }

        val bundle = Bundle()
        bundle.putString("search", searchText)
        findNavController().navigate(R.id.search_dest, bundle, options)
    }

    override fun onStop() {
        super.onStop()
        search_toolbar.clear()
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.main_menu, menu)
    }

    companion object {
        const val API_KEY = BuildConfig.THE_MOVIE_DATABASE_API
    }
}