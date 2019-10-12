package com.hadjimo.tp1

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.details_row.view.*
import kotlinx.android.synthetic.main.video_row.view.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        recyclerView_main.layoutManager = LinearLayoutManager(this)
        recyclerView_main.adapter = DetailAdapter()

        // Changer la navBar
        var titleBar = intent.getStringExtra(CustomViewHolder.KEY_ARTICLE_TITLE)
        supportActionBar?.title = titleBar

        //TODO Impossible de passer les données récupéré ici a onBindViewHolder, trouver un moyen
        var name = intent.getStringExtra(CustomViewHolder.KEY_ARTICLE_NAME)
    }

    private class DetailAdapter: RecyclerView.Adapter<DetailsViewHolder>(){

        override fun getItemCount(): Int {
            return 1
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailsViewHolder {
            val layoutInflater = LayoutInflater.from(parent?.context)
            val customView = layoutInflater.inflate(R.layout.details_row, parent, false)

            return DetailsViewHolder(customView)
        }

        override fun onBindViewHolder(holder: DetailsViewHolder, position: Int) {
            /*
                TODO Récuperer les données et les joindre avec le layout de la sorte (OU AUTRE METHODE) :
                holder.view?.textView_article_title?.text = article.title
                holder.view?.textView_article_name?.text = article.name

             */
        }
    }

    private class DetailsViewHolder(val customView: View): RecyclerView.ViewHolder(customView) {

    }

}