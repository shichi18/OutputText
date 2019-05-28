package com.github.shichi18.outputtextfile

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.LinearLayout
import com.github.shichi18.textviewoutputlibrary.FileOutput


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fileOutput = FileOutput()
        val assetManager = resources.assets
        val linearLayout = findViewById<LinearLayout>(R.id.linearlayout)
        fileOutput.displayAssets(this,"InputData",assetManager,linearLayout)
    }
}
