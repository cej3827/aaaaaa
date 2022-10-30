package com.example.applicationtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bnv_main = findViewById(R.id.bnv_main) as BottomNavigationView

        bnv_main.run{ setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.first -> {
                    val preferScreen = PreferScreen()
                    supportFragmentManager.beginTransaction().replace(R.id.fl_container,preferScreen).commit()
                }
                R.id.second -> {
                    val searchScreen = SearchScreen()
                    supportFragmentManager.beginTransaction().replace(R.id.fl_container,searchScreen).commit()
                }
                R.id.third-> {
                    val homeScreen = HomeScreen()
                    supportFragmentManager.beginTransaction().replace(R.id.fl_container,homeScreen).commit()
                }
                R.id.four -> {
                    val mapScreen = MapScreen()
                    supportFragmentManager.beginTransaction().replace(R.id.fl_container,mapScreen).commit()
                }
                R.id.five -> {
                    val userScreen = UserScreen()
                    supportFragmentManager.beginTransaction().replace(R.id.fl_container,userScreen).commit()
                }
            }
            true
        }
            selectedItemId = R.id.first
        }
    }
}