package ru.androidschool.intensiv.ui.tvshows

import com.squareup.picasso.Picasso
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.item_tv_show.*
import kotlinx.android.synthetic.main.item_with_text.content
import ru.androidschool.intensiv.R
import ru.androidschool.intensiv.data.Movie

class TvShowItem(
    private val entity: Movie,
    private val onClick: (movie: Movie) -> Unit
) : Item() {
    override fun getLayout() = R.layout.item_tv_show

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.tvShowName.text = entity.title
        viewHolder.ivShowRating.rating = entity.rating
        viewHolder.content.setOnClickListener {
            onClick.invoke(entity)
        }
        // TODO Получать из модели
        Picasso.get()
            .load("https://m.media-amazon.com/images/M/MV5BYTk3MDljOWQtNGI2My00OTEzLTlhYjQtOTQ4ODM2MzUwY2IwXkEyXkFqcGdeQXVyNTIzOTk5ODM@._V1_.jpg")
            .into(viewHolder.ivShow)
    }
}