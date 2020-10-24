package ru.mikhailskiy.intensiv.data.repository

import io.reactivex.Single
import ru.mikhailskiy.intensiv.data.vo.Movie
import ru.mikhailskiy.intensiv.domain.repository.MoviesRepository

class MockRepository : MoviesRepository {

    override fun getMovies(): Single<List<Movie>> {
        return Single.just(
            listOf<Movie>(
                Movie(
                    id = 0,
                    originalTitle = "TestTitle",
                    overview = "Test overview",
                    popularity = 10.0,
                    posterPath = "",
                    releaseDate = "20.02.2020",
                    title = "Test title",
                    voteAverage = 10.0
                )
            )
        )
    }
}