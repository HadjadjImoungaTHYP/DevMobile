package com.hadjimo.tp1


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //recyclerView_main.setBackgroundColor(Color.BLUE)

        recyclerView_main.layoutManager = LinearLayoutManager(this)
        recyclerView_main.adapter = MainAdapter()

        val homeFeed = HomeFeed(Article(1,"Diplome","Master","Technologie de l'Hypermedia","dmth@youyou.com","Alien1"))
        val article = Article(1,"Diplome","Master","Technologie de l'Hypermedia","dmth@youyou.com","Alien1")
    }
}

// titre+auteur+date, nom+prénom+email

class HomeFeed(val article: Article)

class Article(val id: Int, val title: String, val name: String, val prenom: String, val email: String, var auteur: String)