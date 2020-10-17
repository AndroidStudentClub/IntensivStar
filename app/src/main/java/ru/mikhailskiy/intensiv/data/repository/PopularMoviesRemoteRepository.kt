package ru.mikhailskiy.intensiv.data.repository

import io.reactivex.Single
import ru.mikhailskiy.intensiv.data.mappers.MovieMapper
import ru.mikhailskiy.intensiv.data.network.MovieApiClient
import ru.mikhailskiy.intensiv.data.vo.Movie
import ru.mikhailskiy.intensiv.domain.repository.MoviesRepository

class PopularMoviesRemoteRepository : MoviesRepository {

    override fun getMovies(): Single<List<Movie>> {
        return MovieApiClient.apiClient.getTopRatedMovies()
            .map { MovieMapper.toValueObject(it) }
    }
}