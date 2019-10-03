package com.hadjimo.tp1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_choix.*
import org.jetbrains.anko.startActivityForResult

class ChoixActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choix)

        valider.setOnClickListener {

            val message = "test"
            startActivity<MainActivity>(
                MainActivity.EXTRA_MESSAGE to message)


            startActivity(intent)
        }

    }
}
