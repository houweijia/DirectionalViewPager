package com.jiehun.veigar.directionalviewpager

import android.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.jiehun.veigar.directionalviewpager.obs.SubscriptionSubject
import kotlinx.android.synthetic.main.activity_main.*

internal class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sum(1, 4)
        main()
        var button: Button = Button(1, "button")

        //var tv = findViewById<TextView>(R.id.tv)
        tv.text = "你好"
        draw()

        var button1 = null
        button1.eat()
        View.VISIBLE

        var weak = WeakS()
        var normal = Normal()
        var strong = Strong()
        var fightStrategy = StrategyContext(weak)
        fightStrategy.fighting()
        var fightStrategy2 = StrategyContext(normal)
        fightStrategy2.fighting()
        var fightStrategy3 = StrategyContext(strong)
        fightStrategy3.fighting()

        var user1 = com.jiehun.veigar.directionalviewpager.obs.User("猴子")
        var user2 = com.jiehun.veigar.directionalviewpager.obs.User("七七")

        var sus = SubscriptionSubject()
        sus.attach(user1)
        sus.attach(user2)
        sus.notify("你好")

        sus.detach(user1)
        sus.notify("hello")
    }

    private fun sum(a: Int, b: Int): Int {   // Int 参数，返回值 Int
        return a + b
    }

    fun printSum(a: Int, b: Int): Unit {
        //print(a + b)
    }

    fun main() {

        var name = "张三"
        var a = 3
        a = 9
        a = 999999999 * 999
        var b: Long = 999999999 * 999
        Log.e("main", "hello kotlin" + a)
        Log.e("main", "hello kotlin" + b)
        System.out.println("1")
    }


    fun draw() {//
        var user = User(1)
        var id = user.id
        user.id = 2
        id = user.id
        Log.e("main", "id==$id")
    }

    fun Any?.eat(): String {
        return "123"
    }
}
