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
            Article(1,"Etudiant","Alien","Ware","alienware@youyou.com","dipsy"),
            Article(2,"Etudiant","Zombie","Land","zl@youyou.com","dipsy"),
            Article(3,"Etudiant","Kraken","Popo","thaKraken@youyou.com","dipsy"),
            Article(4,"Etudiant","Kratos","Killer","krakillall@youyou.com","dipsy")
            )

        val homeFeed = HomeFeed(items)

        recyclerView_main.adapter = MainAdapter(homeFeed)

    }
}

// titre+auteur+date, nom+prénom+email

class HomeFeed(val article: List<Article>)

class Article(val id: Int, val title: String, val name: String, val prenom: String, val email: String, var auteur: String)