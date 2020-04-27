package com.example.pwccomparisontoolapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import org.jetbrains.annotations.TestOnly


const val EXTRA_MESSAGE = "com.pwccomparisontoolapp.MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //This initializes the spinner function by pulling in from the "makes_array"
        val spinner: Spinner = findViewById(R.id.makes_spinner)

// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(this, R.array.makes_array, android.R.layout.simple_spinner_item).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice)
            // Apply the adapter to the spinner
            spinner.adapter = adapter

            //Save selected spinner value

        }


        //Button to move to the next activity (page)
        makes_button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)

            startActivity(intent)
        }

        makes_buttonK.setOnClickListener {
            val intent = Intent(this, KawasakiActivity::class.java)

            startActivity(intent)
        }

        makes_buttonY.setOnClickListener {
            val intent = Intent(this, YamahaActivity::class.java)

            startActivity(intent)
        }

        //Allows the user to switch between make activities (pages) based off of their selection
        spinner.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View?,
                p: Int,
                l: Long
            ) {
                //Makes a toast from what the user selected in the spinner
                //Toast.makeText(this@SecondActivity, spinner2.selectedItem.toString(),   Toast.LENGTH_SHORT).show()

                val text: String = spinner.getSelectedItem().toString()
                val selectedItem = spinner.getItemAtPosition(p)

                //Changes image depending on user selection
                //If user changes selection, image is removed (hidden)


                //Seadoo's
                if (selectedItem.equals("SeaDoo") == true) {
                    Toast.makeText(this@MainActivity, "Selected: Seadoo Makes", Toast.LENGTH_SHORT)
                        .show()

                    makes_button.visibility = View.VISIBLE
                }
                else
                    makes_button.visibility = View.INVISIBLE


                //Kawasaki's
                if (selectedItem.equals("Kawasaki") == true) {
                    Toast.makeText(this@MainActivity, "Selected: Kawasaki Makes", Toast.LENGTH_SHORT)
                        .show()

                    makes_buttonK.visibility = View.VISIBLE
                }
                else
                    makes_buttonK.visibility = View.INVISIBLE

                //Yamaha's
                if (selectedItem.equals("Yamaha") == true) {
                    Toast.makeText(this@MainActivity, "Selected: Yamaha Makes", Toast.LENGTH_SHORT)
                        .show()

                    makes_buttonY.visibility = View.VISIBLE
                }
                else
                    makes_buttonY.visibility = View.INVISIBLE



            }
            override fun onNothingSelected(adapterView: AdapterView<*>?) {
                return
            }

        })














    }



/*
            if (user_budget <= 5000) {
                println("No new PWC's are priced below $5,000")
        }
            if (user_budget > 5000 && user_budget <= 10000) {
                println("Most PWC's are within budget")
            }
            if (user_budget < 10000) {
                println("All PWC's are within budget")
            } else {
                //Financing ex at 36 mo for 10k
                var ex_budget: Double = 0.0
                var mo: Double =36.0
                ex_budget = user_budget * mo
                print("Monthly payment for 36months: ")
                print(ex_budget)

            }*/








}

















