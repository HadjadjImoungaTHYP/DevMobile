package com.hadjimo.tp1


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView_main.layoutManager = LinearLayoutManager(this)

        val items = listOf<Article>(
            Article(1,"Livre : Gamer Pc","Alien","dipsy","2015","Note : 7/10"),
            Article(2,"Livre : Noob Monster","Zombie","Land","2019","Note : 7/10"),
            Article(3,"Livre : Poseidon Monster","Kraken","Popo","2000","Note : 8/10"),
            Article(4,"Livre : Blood God","Kratos","Killer", "2018","Note : 10/10")
            )

        val homeFeed = HomeFeed(items)

        recyclerView_main.adapter = MainAdapter(homeFeed)

    }
}

// titre+auteur+date, nom+prénom+email

class HomeFeed(val article: List<Article>)

class Article(val id: Int, val title: String, val name: String, var auteur: String, var annee: String, var note: String)