package com.example.menuapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav = findViewById(R.id.navBar)

        val controller = findNavController(R.id.navigation)
        val appBarConfig = AppBarConfiguration(setOf(R.id.questionsFragment, R.id.answersFragment))

        setupActionBarWithNavController(controller, appBarConfig)
        bottomNav.setupWithNavController(controller)
    }
}