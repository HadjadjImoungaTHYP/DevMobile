package com.hadjimo.tp1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_choix.*
import org.jetbrains.anko.toast

class ChoixActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_VALIDER = "ChoixActivity.VALIDER"
        const val EXTRA_VALEUR = "ChoixActivity.VALEUR"
        const val EXTRA_ANCIENNE_VALEUR = "ChoixActivity.ANCIENNE_VALEUR"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choix)

        val ancienne = intent.getStringExtra(EXTRA_ANCIENNE_VALEUR)
        if(ancienne != null) {
            // on met l'ancienne valeur que MainActivity nous a envoyé
            editChoix.setText(ancienne)
        }else{
            // Pas d'ancienne valeur, donc on ne peut pas "annuler" on DOIT faire un choix
            btnAnnuler.visibility = View.INVISIBLE
        }

        btnValider.setOnClickListener {
            if(editChoix.text.toString().length == 0){
                // On ne peut pas choisir rien (vide)
                toast(R.string.toast_chainevide)
            }else {
                val intent = Intent()
                // On a valider (=> true)
                intent.putExtra(EXTRA_VALIDER, true)
                // On donne la valeur tapée en retour
                intent.putExtra(EXTRA_VALEUR, editChoix.text.toString())
                setResult(RESULT_OK, intent)
                finish()
            }
        }

        btnAnnuler.setOnClickListener {
            val intent = Intent()
            // On a annulé, = on n'a pas valider (=> false)
            intent.putExtra(EXTRA_VALIDER, false)
            // Pas de valeur tapée, du coup
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}
