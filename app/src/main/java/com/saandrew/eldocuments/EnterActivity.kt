package com.saandrew.eldocuments

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.saandrew.eldocuments.databinding.ActivityEnterBinding
import com.saandrew.eldocuments.databinding.ActivityMainBinding

class EnterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEnterBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEnterBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.enter_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        supportActionBar?.setBackgroundDrawable(ColorDrawable(getColor(R.color.white)))
        setupActionBarWithNavController(navController)

    }
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}