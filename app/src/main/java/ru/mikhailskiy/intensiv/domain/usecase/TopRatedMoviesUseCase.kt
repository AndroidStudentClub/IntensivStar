package ru.mikhailskiy.intensiv.domain.usecase

import io.reactivex.Single
import ru.mikhailskiy.intensiv.data.vo.Movie
import ru.mikhailskiy.intensiv.domain.repository.MoviesRepository

class TopRatedMoviesUseCase(private val repository: MoviesRepository) {

    fun getMovies(): Single<List<Movie>> {
        return repository.getMovies()
            .applySchedulers()
    }
}