package com.hadjimo.tp1

import android.content.Intent
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

        holder?.article = article
    }
}

class CustomViewHolder(val view: View, var article: Article? = null): RecyclerView.ViewHolder(view) {

    // Permet de passer
    companion object {
        val KEY_ARTICLE_TITLE = "TITLE_ARTICLE"
        val KEY_ARTICLE_NAME = "NAME_ARTICLE"
    }

    init {
        view.setOnClickListener {
            println("SVP FAUT QUE CA MAAAAAAAAAAAAAAAARCHE")

            // Passer les infos a une autre activité
            val intent = Intent(view.context, DetailsActivity::class.java)
            intent.putExtra(KEY_ARTICLE_TITLE, article?.title)
            intent.putExtra(KEY_ARTICLE_NAME, article?.name)

            view.context.startActivity(intent)
        }
    }
}