package com.github.shichi18.outputtext

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.LinearLayout
import com.github.shichi18.outputtextfile.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //add code
        val outputTextView = OutputTextView()
        val assetManager = resources.assets
        val linearLayout = findViewById<LinearLayout>(R.id.linearlayout)
        outputTextView.textViewAssets(this, "InputData", assetManager, linearLayout)
    }
}
