package ru.androidschool.intensiv.ui.search

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.feed_header.*
import ru.androidschool.intensiv.R
import ru.androidschool.intensiv.ui.feed.FeedFragment.Companion.KEY_SEARCH

class SearchFragment : Fragment(R.layout.fragment_search) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val searchTerm = requireArguments().getString(KEY_SEARCH)
        search_toolbar.setText(searchTerm)
    }
}
