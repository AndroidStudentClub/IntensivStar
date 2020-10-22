package ru.mikhailskiy.intensiv.di

import org.koin.dsl.module
import ru.mikhailskiy.intensiv.data.network.MovieApiClient
import ru.mikhailskiy.intensiv.data.network.MovieApiInterface
import ru.mikhailskiy.intensiv.data.repository.TopRatedMoviesRemoteRepository
import ru.mikhailskiy.intensiv.domain.repository.MoviesRepository
import ru.mikhailskiy.intensiv.domain.usecase.TopRatedMoviesUseCase
import ru.mikhailskiy.intensiv.presentation.feed.FeedPresenter

val dataModule = module {
    single<MovieApiInterface> { MovieApiClient.apiClient }
}

val domainModule = module {
    single<TopRatedMoviesUseCase> { TopRatedMoviesUseCase(get()) }
    single<MoviesRepository> { TopRatedMoviesRemoteRepository() }
}

val presentationModule = module {
    factory { FeedPresenter() }
}