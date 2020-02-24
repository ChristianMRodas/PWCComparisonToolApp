package com.example.pwccomparisontoolapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        //This initializes the spinner function by pulling in from the "makes_array"
        val spinner: Spinner = findViewById(R.id.makes_spinner)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.makes_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }

/*
        Spinner mySpinner = (Spinner) findViewById(R.id.Makes_Spinner)

        //An array adapter is bascially how the string arrays are placed into the Spinner
        ArrayAdapter<String> = myAdapater = new ArrayAdapter<String>(MainActivity.this,
            android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Makes))
        myAdapter.setDropdownViewResource(android.R.layout.simple_spinner_dropdown_item)
        Makes_SpinnterAdapater.setAdapter(myAdapter);


        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        */

    }
}
