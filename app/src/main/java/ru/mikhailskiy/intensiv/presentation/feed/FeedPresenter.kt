package ru.mikhailskiy.intensiv.presentation.feed

import android.annotation.SuppressLint
import org.koin.core.KoinComponent
import org.koin.core.inject
import ru.mikhailskiy.intensiv.data.vo.Movie
import ru.mikhailskiy.intensiv.domain.usecase.TopRatedMoviesUseCase
import ru.mikhailskiy.intensiv.presentation.base.BasePresenter
import timber.log.Timber

class FeedPresenter : BasePresenter<FeedPresenter.FeedView>(), KoinComponent {

    private val useCase: TopRatedMoviesUseCase by inject()

    @SuppressLint("CheckResult")
    fun getMovies() {
        useCase.getMovies()
            .subscribe(
                {
                    view?.showMovies(it)
                },
                { t ->
                    Timber.e(t, t.toString())
                    view?.showEmptyMovies()
                })
    }

    interface FeedView {
        fun showMovies(movies: List<Movie>)
        fun showLoading()
        fun hideLoading()
        fun showEmptyMovies()
        fun showError()
    }
}