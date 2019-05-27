package com.github.shichi18.textviewoutputlibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.io.InputStream

class OutputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)
    }


    private fun fileInput(view: View,textName :String) {
        val licenseText = view.findViewById<TextView>(R.id.output_text)

        val inputStream: InputStream = resources.assets.open(textName)
        val inputString = inputStream.bufferedReader().use { it.readText() }
        licenseText.text = inputString
    }



}
