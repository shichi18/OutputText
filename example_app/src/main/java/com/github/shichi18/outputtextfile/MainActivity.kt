package com.github.shichi18.outputtextfile

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.LinearLayout
import android.widget.TextView
import com.github.shichi18.textviewoutputlibrary.FileOutput
import java.io.InputStream


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fileOutput = FileOutput()
        val assetManager = resources.assets
        val list = fileOutput.displayAssets("InputData", assetManager)

        val linearLayout = findViewById<LinearLayout>(R.id.linearlayout)
        for (i in list!!.indices) {
            val inputStream: InputStream = assetManager.open("InputData/" + list[i])
            val inputString = fileOutput.fileInput(inputStream)
            val textView = TextView(this)
            textView.text = inputString
            linearLayout.addView(textView)
        }
    }
}
