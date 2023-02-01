package com.neillbarrett.debitsandcredits

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setupUI()
    }

/*    private fun setupUI() {
        supportFragmentManager
                //add/perform an action with fragment in response to user interaction
            .beginTransaction()
            .add(R.id.mainFragment, MainFragment())
            .commitNow()
    }*/

    private fun setupNavController() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.mainFragment) as NavHostFragment

        navController = navHostFragment.navController
    }
}