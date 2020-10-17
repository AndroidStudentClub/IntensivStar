package ru.mikhailskiy.intensiv.domain.repository

import io.reactivex.Single
import ru.mikhailskiy.intensiv.data.vo.Movie

interface MoviesRepository {
    fun getMovies(): Single<List<Movie>>
}