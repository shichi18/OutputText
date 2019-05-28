package com.github.shichi18.textviewoutputlibrary

import android.app.Activity
import android.content.Context
import android.content.res.AssetManager
import android.widget.LinearLayout
import android.widget.TextView
import java.io.IOException
import java.io.InputStream

class FileOutput {

    fun fileInput(inputStream: InputStream): String {
        return inputStream.bufferedReader().use { it.readText() }
    }

    fun displayAssets(
        context: Context,
        dir: String,
        assetManager: AssetManager,
        linearLayout: LinearLayout
    ): Array<String>? {
        val files: Array<String>? = assetManager.list(dir)
        val match = LinearLayout.LayoutParams.MATCH_PARENT

        val layoutParams = LinearLayout.LayoutParams(match, match)
        layoutParams.setMargins(0, 20, 0, 20)

        try {
            for (i in files!!.indices) {
                println(files[i])
                val inputStream: InputStream = assetManager.open("InputData/" + files[i])
                val inputString = fileInput(inputStream)
                val textView = TextView(context)

                textView.setBackgroundResource(R.drawable.border)
                textView.setPadding(20, 20, 20, 20)
                textView.text = inputString
                textView.layoutParams = layoutParams
                linearLayout.addView(textView)

            }
            return files
        } catch (e: IOException) {
        }
        return files
    }

}


