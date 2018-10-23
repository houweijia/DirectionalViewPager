package com.jiehun.veigar.directionalviewpager

import android.app.Fragment
import android.util.Log
import android.widget.Toast
import java.util.ArrayList

/**
 * @description:
 *
 * @author: houwj
 * @date: 2018/10/6
 */
class Button{
    //(val id:Int, var text :String)
    val id :Int
    val text : String

    constructor(id :Int ,text :String ){
        this.id = id
        this.text = text
    }



    fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    fun foreach(){
        var list : List<String> = ArrayList()

        for (i in 1..list.size){
            Log.e("main", "i==$i")
        }

        var t = null
        t.toString()
    }

    fun Fragment.toast1(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(activity, message, duration).show()
    }

    fun Any?.toString(): String {
        if (this == null) return "null"
        // 空检测之后，“this”会自动转换为非空类型，所以下面的 toString()
        // 解析为 Any 类的成员函数
        return toString()
    }

    fun Button.print(){
        print("用户名$id")
    }

    fun main(arg:Array<String>){
        var button = Button(12,"Runoob")
        button.print()
    }
}