package com.hadjimo.tp1

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivityForResult

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnModifier.setOnClickListener {
            startActivityForResult<ChoixActivity>(1, ChoixActivity.EXTRA_ANCIENNE_VALEUR to txtValeur.text)
        }

        // On doit faire un choix tout de suite, mais sans ancienne valeur
        startActivityForResult<ChoixActivity>(2)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when(requestCode){
            1 -> {
                // Résultat de startActivityForResult<ModifierActivity>
                if(resultCode == Activity.RESULT_OK){
                    val valider = data?.getBooleanExtra(ChoixActivity.EXTRA_VALIDER, false) ?: false
                    if(valider){
                        // L'utilisateur a utilisé le bouton "valider"
                        // On récupère la valeur dans l'extra (avec une valeur par défaut de "")
                        val nouvValeur = data?.getStringExtra(ChoixActivity.EXTRA_VALEUR) ?: ""
                        // On l'affiche
                        txtValeur.text = nouvValeur
                    }else{
                        // L'utilisateur a utilisé le bouton "annuler"
                        // on ne fait rien de spécial
                    }
                }else if(resultCode == Activity.RESULT_CANCELED){
                    // L'utilisateur a utilisé le bouton retour <- de son téléphone
                    // on ne fait rien de spécial non plus
                }
            }
            2 -> {
                // Résultat de startActivityForResult<ModifierActivity> initial (sans ancienne valeur)
                if(resultCode == Activity.RESULT_OK){
                    // On a obligatoirement valider dans ce cas là (pas de bouton annuler)
                    val nouvValeur = data?.getStringExtra(ChoixActivity.EXTRA_VALEUR) ?: ""
                    txtValeur.text = nouvValeur
                }else if(resultCode == Activity.RESULT_CANCELED){
                    // L'utilisateur a utilisé le bouton retour <- de son téléphone
                    // on quitte l'appli
                    finish()
                }
            }
        }
    }
}
