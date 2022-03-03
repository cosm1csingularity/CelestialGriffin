package com.my.hc.rpg.kingdom.simulato0

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_celestial_griffin.*

class CelestialGriffin : AppCompatActivity() {

    var scoreCheck = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_celestial_griffin)
        nest.setOnClickListener {
            scoreCheck++
            score.setText(scoreCheck.toString())
            if (score.text!! == "15") {
                niceTxt.setText("Oh, it's work!")
            }
            if (score.text!! == "30") {
                niceTxt.setText("Step on it!")

            }
            if (score.text!! == "100") {
                niceTxt.setText("Good Job!")
                Intent(applicationContext, FinishPart::class.java).also { startActivity(it) }
                    finish()

            }
        }

    }

}