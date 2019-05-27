package com.github.shichi18.textviewoutputlibrary

import java.io.InputStream

class FileOutput {

    fun fileInput(inputStream: InputStream): String {
//        val licenseText = view.findViewById<TextView>(R.id.output_text)

//        val inputStream: InputStream = resources.assets.open(textName)
//        val inputString = inputStream.bufferedReader().use { it.readText() }
//        licenseText.text = inputString
        return inputStream.bufferedReader().use { it.readText() }
    }

}
