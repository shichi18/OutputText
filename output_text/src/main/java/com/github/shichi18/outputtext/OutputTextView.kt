package com.github.shichi18.outputtext

import android.content.Context
import android.content.res.AssetManager
import android.widget.LinearLayout
import android.widget.TextView
import java.io.IOException
import java.io.InputStream

class OutputTextView {

    private fun fileInput(assetManager: AssetManager, files: String, dir: String): String {
        val inputStream: InputStream = assetManager.open("$dir/$files")
        return inputStream.bufferedReader().use { it.readText() }
    }

    fun textViewAssets(
        context: Context,
        dir: String,
        assetManager: AssetManager,
        linearLayout: LinearLayout
    ) {
        val files: Array<String>? = assetManager.list(dir)
        val match = LinearLayout.LayoutParams.MATCH_PARENT

        val layoutParams = LinearLayout.LayoutParams(match, match)
        layoutParams.setMargins(0, 20, 0, 20)

        try {
            for (i in files!!.indices) {
                val textView = TextView(context)
                textView.setBackgroundResource(R.drawable.border)
                textView.setPadding(20, 20, 20, 20)
                textView.text = fileInput(assetManager, files[i], dir)
                textView.layoutParams = layoutParams
                linearLayout.addView(textView)
            }

        } catch (e: IOException) {
            println("Error")
        }

    }

}


