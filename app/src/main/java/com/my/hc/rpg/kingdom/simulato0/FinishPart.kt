package com.my.hc.rpg.kingdom.simulato0

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FinishPart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish_part)
    }

    fun tryagain (view: View) {
        Intent(applicationContext, CelestialGriffin::class.java).also { startActivity(it) }
        finish()
    }
}