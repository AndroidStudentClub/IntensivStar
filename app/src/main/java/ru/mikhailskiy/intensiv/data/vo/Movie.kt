package ru.mikhailskiy.intensiv.data.vo

data class Movie(
    val id: Int,
    val originalTitle: String,
    val overview: String,
    val popularity: Double,
    val posterPath: String,
    val releaseDate: String,
    val title: String,
    val voteAverage: Double
) {
    val rating: Double
        get() = voteAverage / 2
}