package com.hadjimo.tp1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.video_row.view.*

class MainAdapter(val homeFeed: HomeFeed): RecyclerView.Adapter<CustomViewHolder>() {

    // Nombre d'items
    override fun getItemCount(): Int {
        return homeFeed.article.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.video_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val article = homeFeed.article.get(position)
        holder.view?.textView_article_title?.text = article.title
        holder.view?.textView_article_name?.text = article.name
    }

}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view) {
    init {
        view.setOnClickListener {
            println("TEst")
        }
    }
}