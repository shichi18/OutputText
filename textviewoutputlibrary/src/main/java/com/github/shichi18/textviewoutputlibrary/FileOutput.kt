package com.github.shichi18.textviewoutputlibrary

import android.content.res.AssetManager
import java.io.IOException
import java.io.InputStream

class FileOutput {

    fun fileInput(inputStream: InputStream): String {
        return inputStream.bufferedReader().use { it.readText() }
    }

    fun displayAssets(dir: String, assetManager: AssetManager): Array<String>? {
        val files: Array<String>? = assetManager.list(dir)
        try {
            for (i in files!!.indices) {
                println(files[i])

            }
            return files
        } catch (e: IOException) {
        }
        return files
    }

}


