@file:Suppress("SyntaxError")

package com.example.pwccomparisontoolapp

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_kawasaki.*

class KawasakiActivity : AppCompatActivity() {

    var testImg = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kawasaki)


        //Initializes next spinner (models) for the user to pick from
        val spinnerK: Spinner = findViewById(R.id.models_spinnerr)
        //val spinner = Spinner(this)


        ArrayAdapter.createFromResource(
            this,R.array.models_Kawasaki_array,android.R.layout.simple_spinner_item).also {
                adapter ->
            adapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice)
            spinnerK.adapter = adapter

        }

        spinnerK.setOnItemSelectedListener(object : OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View?,
                p: Int,
                l: Long
            ) {
                //Makes a toast from what the user selected in the spinner
                //Toast.makeText(this@SecondActivity, spinner2.selectedItem.toString(),   Toast.LENGTH_SHORT).show()

                val text: String = spinnerK.getSelectedItem().toString()
                val selectedItem = spinnerK.getItemAtPosition(p)

                //Changes image depending on user selection
                //If user changes selection, image is removed (hidden)

                //Kawasaki Images
                if (selectedItem.equals("SX-R") == true) {
                    Toast.makeText(this@KawasakiActivity, "Selected: SX-R model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_SXR.visibility = View.VISIBLE
                }
                else
                    imgB_SXR.visibility = View.INVISIBLE


            }
            override fun onNothingSelected(adapterView: AdapterView<*>?) {
                return
            }

        })

    }

}

