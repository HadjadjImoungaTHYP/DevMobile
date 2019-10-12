package com.hadjimo.tp1

import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        recyclerView_main.layoutManager = LinearLayoutManager(this)
        recyclerView_main.adapter = DetailAdapter()

    }

    private class DetailAdapter: RecyclerView.Adapter<DetailsViewHolder>(){

        override fun getItemCount(): Int {
            return 1
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailsViewHolder {
            val blueView = View(parent?.context)
            blueView.setBackgroundColor(Color.BLUE)
            blueView.minimumHeight = 50
            return DetailsViewHolder(blueView)
        }

        override fun onBindViewHolder(holder: DetailsViewHolder, position: Int) {

        }
    }

    private class DetailsViewHolder(val customView: View): RecyclerView.ViewHolder(customView) {

    }

}