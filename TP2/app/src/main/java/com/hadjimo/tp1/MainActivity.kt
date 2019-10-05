package com.hadjimo.tp1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivityForResult

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        var message = textView3.text.toString()
        modifier.setOnClickListener {
            startActivityForResult<ChoixActivity>(11, ChoixActivity.MESSAGE to message)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        try {
            when (requestCode) {
                11 -> {
                    if (resultCode == RESULT_OK) {
                        val name = data?.getStringExtra(
                            ChoixActivity.
                                EXTRA_ISCONFIRMED)
                            ?: false
                        textView3.text = name.toString()
                    }  else if(resultCode == RESULT_CANCELED) {
                        Toast.makeText(this, "Annulation", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        } finally {
            Toast.makeText(this, "Fin du processus", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()

        Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()

        Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show()
    }
}
