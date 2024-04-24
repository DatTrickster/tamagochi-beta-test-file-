package com.example.tamagotchib

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tamagotchi: Tamagotchi
    private lateinit var tamagotchiStatusTextView: TextView
    private lateinit var tamagotchiImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tamagotchi = Tamagotchi("Tamagotchi")
        tamagotchiStatusTextView = findViewById(R.id.tamagotchiStatusTextView)
        tamagotchiImageView = findViewById(R.id.tamagotchiImageView)

        findViewById<Button>(R.id.feedButton).setOnClickListener { feedTamagotchi() }
        findViewById<Button>(R.id.playButton).setOnClickListener { playWithTamagotchi() }
        findViewById<Button>(R.id.sleepButton).setOnClickListener { letTamagotchiSleep() }
        findViewById<Button>(R.id.statusButton).setOnClickListener { displayTamagotchiStatus() }
    }

    private fun feedTamagotchi() {
        TamagotchiActions.feedTamagotchi(tamagotchi)
        updateStatusAndImage()
    }

    private fun playWithTamagotchi() {
        TamagotchiActions.playWithTamagotchi(tamagotchi)
        updateStatusAndImage()
    }

    private fun letTamagotchiSleep() {
        TamagotchiActions.letTamagotchiSleep(tamagotchi)
        updateStatusAndImage()
    }

    private fun displayTamagotchiStatus() {
        updateStatusAndImage()
    }

    private fun updateStatusAndImage() {
        tamagotchiStatusTextView.text = tamagotchi.getStatus()
        tamagotchiImageView.setImageResource(TamagotchiActions.getTamagotchiImage(tamagotchi))
    }
}
