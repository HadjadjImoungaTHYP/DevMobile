package com.hadjimo.tp1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_choix.*

class ChoixActivity : AppCompatActivity() {

    companion object {
        const val MESSAGE = "ChoixActivity.MESSAGE"
        const val EXTRA_ISCONFIRMED = "ChoixActivity.ISCONFIRMED"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choix)
        var texte = intent.getStringExtra(MESSAGE)
        userName.setText(texte)
        annuler.setOnClickListener {
            finish()

        }
        valider.setOnClickListener {
            var choix = "FLURB"
            if(userName.text.toString() != "")
            choix = userName.text.toString()
            val intent = Intent()
            intent.putExtra(EXTRA_ISCONFIRMED, choix)
            setResult(RESULT_OK, intent)
            finish()
        }

    }

}
