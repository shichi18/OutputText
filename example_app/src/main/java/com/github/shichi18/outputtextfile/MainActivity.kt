package com.github.shichi18.outputtextfile

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.LinearLayout
import com.github.shichi18.textviewoutputlibrary.PushTextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pushTextView = PushTextView()
        val assetManager = resources.assets
        val linearLayout = findViewById<LinearLayout>(R.id.linearlayout)
        pushTextView.textViewAssets(this,"InputData",assetManager,linearLayout)
    }
}
