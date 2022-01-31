package com.saandrew.eldocuments

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.saandrew.eldocuments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.bottomNavigation

        navController = findNavController(R.id.nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_documents,
                R.id.navigation_qr,
                R.id.user_profile_navigation
            )
        )

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.navigation_qr -> navView.visibility = View.VISIBLE
                R.id.navigation_documents -> navView.visibility = View.VISIBLE
                R.id.user_profile_navigation -> navView.visibility = View.VISIBLE
                else -> navView.visibility = View.GONE
            }
        }

        supportActionBar?.setBackgroundDrawable(ColorDrawable(getColor(R.color.white)))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

}