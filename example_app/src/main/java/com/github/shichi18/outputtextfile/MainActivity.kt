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

//        val licenseText = findViewById<TextView>(R.id.output_text)
//        val textName = "InputData/input.txt"
        val fileOutput = FileOutput()

        val assetManager = resources.assets
        var list = fileOutput.displayAssets("InputData", assetManager)

        val linearLayout = findViewById<LinearLayout>(R.id.linearlayout)
        for (i in list!!.indices) {
            val inputStream: InputStream = assetManager.open("InputData/" + list[i])
            val inputString = fileOutput.fileInput(inputStream)
//            licenseText.text = inputString
            val textView = TextView(this)
            textView.text = inputString
//            textView.textSize = 50f
//            textView.setTextColor(Color.RED)
            linearLayout.addView(textView)
        }

//        val assetManager = assets
//        val files = assetManager.list("your_folder_name_inside_assets")
//        val it = LinkedList<String>(Arrays.asList(files))
//
//        val assetMgr = resources.assets
//        /** assets内のファイルをログ表示.*/
//        fileoutput.displayAssets("InputData",assetMgr)

    }

}
