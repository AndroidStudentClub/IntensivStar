# Выходим в сеть. Retrofit, GSON, Interceptors

<aside>
💡 Работа с сетью. Retrofit, GSON, Glide

Организация сетевого взаимодействия. В первом занятии вы разработаете сетевой слой приложения на базе Retrofit и GSON. Мы рассмотрим продвинутые аннотации GSON, научимся использовать interceptors в Retrofit для повторной авторизации и логирования данных. Подключим Flipper для просмотра запросов

</aside>


### В результате:
- сможете настроить сетевой слой приложения
- осуществлять запросы в сеть
- использовать продвинутые возможности GSON
- использовать OkHttp Interceptors
- загружать картинки с помощью Glide

# Домашнее задание

### 🎯 Цели домашнего задания:

В этом задании мы отработаем навыки работы с Retrofit. Чтобы было проще его выполнить здесь примерный план, по которому вы можете работать:

- Получить API-ключ в The Movie Database
- Вставить в  keystore.properties  API-ключ
- Добавить библиотеки для работы с Retrofit как показано в презентации

### 📚 Подробный план:

### Реализация запроса для получения фильмов now_playing

План реализации получения списка фильмов:

- Описать модели для получения ответа (MovieResponse, Movie)
- Описать методы API (Тип запроса (Get/Post), тип возвращаемого значения)

Документация запроса https://developers.themoviedb.org/3/movies/get-now-playing

- Создать ApiClient инициализирующий Retrofit
- Добавить логер для логирования запросов
- Сделать вызов метода получения списка фильмов из FeedFragment и заполнить список полученными данными

Аналогично добавить запросы для

- Получение новинок Upcoming https://developers.themoviedb.org/3/movies/get-upcoming
- Получение популярных фильмов Popular(https://developers.themoviedb.org/3/movies/get-popular-movies)

### Реализовать запрос для получения списка телесериалов

- Реализовать запрос для получения списка телесериалов https://developers.themoviedb.org/3/tv/get-popular-tv-shows

### Реализация страницы деталей фильма

1. Реализовать запрос для получения деталей фильма
- https://developers.themoviedb.org/3/movies/get-movie-details
- https://developers.themoviedb.org/3/movies/get-movie-credits

### 📚 Полезные материалы:

- [Примеры кода из презентации](https://github.com/AndroidStudentClub/NetworkExamples/tree/master)
- [Flipper Network plugin](https://fbflipper.com/docs/setup/network-plugin/)
- Оф. страница Flipper [Android](https://fbflipper.com/docs/getting-started/android-native)
- [Обзор на Flipper medium](https://medium.com/@shubhapatnim86/flipper-a-desktop-debugging-platform-for-mobile-developers-ff167d24b702)
- [ChuckInterceptor](https://github.com/jgilfelt/chuck)



