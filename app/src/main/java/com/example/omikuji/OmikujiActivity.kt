package com.example.omikuji

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.main.*
import java.util.*

class OmikujiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        // 文字を表示する
        val str = "大吉"
        val rnd = Random()
        val number = rnd.nextInt(3)
        hello_view.text = "$str 乱数 ${number + 1}"
    }
}
