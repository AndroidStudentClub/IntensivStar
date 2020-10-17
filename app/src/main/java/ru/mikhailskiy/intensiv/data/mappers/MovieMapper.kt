package ru.mikhailskiy.intensiv.data.mappers

import ru.mikhailskiy.intensiv.data.dto.MovieDto
import ru.mikhailskiy.intensiv.data.dto.MoviesResponseDto
import ru.mikhailskiy.intensiv.data.vo.Movie

object MovieMapper {

    fun toValueObject(dto: MoviesResponseDto): List<Movie> {
        return dto.results.map { toValueObject(it) }
    }

    private fun toValueObject(dto: MovieDto): Movie {
        return Movie(
            id = dto.id,
            originalTitle = dto.originalTitle,
            overview = dto.overview,
            popularity = dto.popularity,
            posterPath = dto.posterPath,
            releaseDate = dto.releaseDate,
            title = dto.title,
            voteAverage = dto.voteAverage
        )
    }
}