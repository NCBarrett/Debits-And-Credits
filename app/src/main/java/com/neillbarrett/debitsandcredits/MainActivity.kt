package com.neillbarrett.debitsandcredits

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUI()
    }

    private fun setupUI() {
        supportFragmentManager
                //add/perform an action with fragment in response to user interaction
            .beginTransaction()
            .add(R.id.mainFragment, MainFragment())
            .commitNow()
    }
}