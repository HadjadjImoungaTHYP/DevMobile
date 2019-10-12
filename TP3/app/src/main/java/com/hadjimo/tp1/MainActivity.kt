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
            Article(1,"Gamer Pc","Alien","Ware","alienware@youyou.com","dipsy"),
            Article(2,"Noob Monster","Zombie","Land","zl@youyou.com","dipsy"),
            Article(3,"Poseidon Horse","Kraken","Popo","thaKraken@youyou.com","dipsy"),
            Article(4,"Blood God","Kratos","Killer","krakillall@youyou.com","dipsy")
            )

        val homeFeed = HomeFeed(items)

        recyclerView_main.adapter = MainAdapter(homeFeed)

    }
}

// titre+auteur+date, nom+prénom+email

class HomeFeed(val article: List<Article>)

class Article(val id: Int, val title: String, val name: String, val prenom: String, val email: String, var auteur: String)