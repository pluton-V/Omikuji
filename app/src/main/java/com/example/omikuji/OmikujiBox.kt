package com.example.omikuji

import android.widget.ImageView
import java.util.*

class OmikujiBox {
    lateinit var omikujiView: ImageView
    var finish = false // 箱から出たか？

    val number : Int // くじ番号 (0～19の乱数)
    get() {
        val rnd = Random()
        return rnd.nextInt(20)
    }

    fun shake() {

    }
}