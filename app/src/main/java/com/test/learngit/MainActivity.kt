package com.test.learngit

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text1.text = "abc"
        text1.text = "haha"
        text1.inputType = 0
        text1.text= "lol"
        text1.text = "hohoho"
        text1.text = "hehehe"
        text1.text = "huhuhu"
        text1.text = "h3h3h3"
    }
}
