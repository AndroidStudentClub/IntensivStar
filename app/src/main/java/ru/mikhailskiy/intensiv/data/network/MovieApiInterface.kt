package ru.mikhailskiy.intensiv.data.network

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query
import ru.mikhailskiy.intensiv.BuildConfig
import ru.mikhailskiy.intensiv.data.dto.MoviesResponseDto


interface MovieApiInterface {

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = API_KEY,
        @Query("language") language: String = LANGUAGE
    ): Single<MoviesResponseDto>

    @GET("movie/popular")
    fun getPopular(
        @Query("api_key") apiKey: String = API_KEY,
        @Query("language") language: String = LANGUAGE
    ): Single<MoviesResponseDto>


    companion object {
        const val LANGUAGE = "ru"
        const val API_KEY = BuildConfig.THE_MOVIE_DATABASE_API
    }
}

