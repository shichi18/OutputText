package com.github.shichi18.textviewoutputlibrary

import android.content.res.AssetManager
import android.util.Log
import java.io.IOException
import java.io.InputStream

class FileOutput {

    fun fileInput(inputStream: InputStream): String {
//        val licenseText = view.findViewById<TextView>(R.id.output_text)

//        val inputStream: InputStream = resources.assets.open(textName)
//        val inputString = inputStream.bufferedReader().use { it.readText() }
//        licenseText.text = inputString
        return inputStream.bufferedReader().use { it.readText() }
    }

    fun displayAssets(dir: String, assetManager: AssetManager): Array<String>? {
        val files = assetManager.list(dir)
        try {
//            val files = assetManager.list(dir)
            for (i in files!!.indices) {
                println(files[i])

            }
            return files
        } catch (e: IOException) {
        }
        return files
    }

}


