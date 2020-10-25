package jp.techachademy.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human_s = Human("佐藤", 20,"旅行")

        human_s.say()
        human_s.think()

        val human_t = Human("田中",40,"スキューバダイビング")
        human_t.say()
        human_t.think()

    }
}
