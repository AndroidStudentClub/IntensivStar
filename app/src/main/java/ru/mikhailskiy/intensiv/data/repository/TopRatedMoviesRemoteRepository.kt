package ru.mikhailskiy.intensiv.data.repository

import io.reactivex.Single
import org.koin.core.KoinComponent
import org.koin.core.inject
import ru.mikhailskiy.intensiv.data.mappers.MovieMapper
import ru.mikhailskiy.intensiv.data.network.MovieApiInterface
import ru.mikhailskiy.intensiv.data.vo.Movie
import ru.mikhailskiy.intensiv.domain.repository.MoviesRepository

class TopRatedMoviesRemoteRepository : MoviesRepository, KoinComponent {

    private val apiClient: MovieApiInterface by inject()

    override fun getMovies(): Single<List<Movie>> {
        return apiClient.getTopRatedMovies()
            .map { MovieMapper.toValueObject(it) }
    }
}
