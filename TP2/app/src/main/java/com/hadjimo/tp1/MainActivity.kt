package com.hadjimo.tp1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show()

        modifier.setOnClickListener {

            companion object {
            const val EXTRA_MESSAGE =
                "ConfirmationActivity.MESSAGE"
        }
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.choix_activity)
                val message = intent.getStringExtra(EXTRA_MESSAGE)
            }

            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show()
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
