package com.my.hc.rpg.kingdom.simulato0

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FirstAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
    }
    fun start(view: View) {
        Intent(applicationContext, CelestialGriffin::class.java).also { startActivity(it) }
        finish()
    }
}