package ru.mikhailskiy.intensiv.data.dto

import com.google.gson.annotations.SerializedName

data class MoviesResponseDto(
    val dates: DateDto,
    val page: Int,
    val results: List<MovieDto>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)