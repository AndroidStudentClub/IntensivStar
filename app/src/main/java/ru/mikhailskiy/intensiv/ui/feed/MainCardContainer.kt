package ru.mikhailskiy.intensiv.ui.feed

import androidx.annotation.StringRes
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.item_card.*
import ru.mikhailskiy.intensiv.R

class MainCardContainer(
    @StringRes
    private val title: Int,
    private val items: List<Item>
) : Item() {

    override fun getLayout() = R.layout.item_card

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.title_text_view.text = viewHolder.title_text_view.context.getString(title)
        viewHolder.items_container.adapter =
            GroupAdapter<GroupieViewHolder>().apply { addAll(items) }
    }
}