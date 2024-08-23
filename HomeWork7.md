# Домашнее задание

### 🎯 Цели домашнего задания:

- Освоить принципы Clean Architecture
- Реализовать разбиение на слои согласно Clean Architecture
- Создать Repository, Interactors, UseCases, DataSource и другие необходимые компоненты
- Научиться работать с MVP

### 📚 Задание

- Создать 3 packages: Data, Domain, Presentation. Распределить имеющиеся компоненты в соответствующие слои
- Создать интерфейсы репозиториев для фильмов/актеров/сериалов. 
- Реализовать методы интерфейса репозиториев.
- Создать необходимые DataSource, например LocalDataSource для работы с данными, NetworkDataSource для работы с API
- Создать необходимые UseCase для получения фильмов/сериалов/актеров
- Создать модели данных для DTO/Domain-моделей
- Создать конверторы (mappers) задача которых конвертация из DTO->Domain
- Опционально (если вы никогда не работали с MVP). Реализовать MVP на экране отображения списка ТВ-сериалов. Создать Presenter, вынести логику получения сериалов UseCase и добавить обработку ответа в Presenter.

![Описание домашнего задания](images/home_task_7.png)

### 📚 Полезные материалы:
- [Статья про заблуждения Clean](https://habr.com/ru/company/mobileup/blog/335382/)
- [Пример проекта из презентации Ветка mvp-and-clean](https://github.com/AndroidStudentClub/IntensivStar/tree/feature/mvp-and-clean)
- [Статья про Clean Architecture в Android](https://fernandocejas.com/2014/09/03/architecting-android-the-clean-way/)
- [Статья про MVP в Android](https://habr.com/ru/company/rambler_group/blog/275943/)
- [Наглядный пример различия DTO, POCO (POJO) и Value Object](https://ru.stackoverflow.com/questions/456623/%D0%9D%D0%B0%D0%B3%D0%BB%D1%8F%D0%B4%D0%BD%D1%8B%D0%B9-%D0%BF%D1%80%D0%B8%D0%BC%D0%B5%D1%80-%D1%80%D0%B0%D0%B7%D0%BB%D0%B8%D1%87%D0%B8%D1%8F-dto-poco-pojo-%D0%B8-value-object#:~:text=DTO%20%E2%80%94%20%D1%8D%D1%82%D0%BE%20%D0%BA%D0%BB%D0%B0%D1%81%D1%81%20%D1%81%20%D0%B4%D0%B0%D0%BD%D0%BD%D1%8B%D0%BC%D0%B8,%D0%B4%D0%BB%D1%8F%20%D0%BF%D0%BE%D0%BB%D1%83%D1%87%D0%B5%D0%BD%D0%B8%D1%8F%20%D0%B8%20%D0%B8%D0%B7%D0%BC%D0%B5%D0%BD%D0%B5%D0%BD%D0%B8%D1%8F%20%D0%B4%D0%B0%D0%BD%D0%BD%D1%8B%D1%85)

### 👨‍💻 Исходный код примеров из вебинара:
- [Репозиторий с примером из этой же статьи](https://github.com/android10/Android-CleanArchitecture)



