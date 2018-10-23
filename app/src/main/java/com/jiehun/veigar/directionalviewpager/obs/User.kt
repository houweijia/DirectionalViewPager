package com.jiehun.veigar.directionalviewpager.obs

import android.util.Log

/**
 * @description:
 * @author: houwj
 * @date: 2018/10/17
 */

class User(private var name: String) : Observer {

    override fun update(message: String) {
        Log.e("main", "$name--$message")
    }
}
