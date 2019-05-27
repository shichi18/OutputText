package com.github.shichi18.outputtextfile

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.github.shichi18.textviewoutputlibrary.FileOutput
import java.io.InputStream

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val licenseText = findViewById<TextView>(R.id.output_text)
        val textName = "Output.txt"
        val inputStream: InputStream = resources.assets.open(textName)
        val fileoutput = FileOutput()
        val inputString = fileoutput.fileInput(inputStream)
        licenseText.text = inputString

    }
}
