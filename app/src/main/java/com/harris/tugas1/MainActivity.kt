package com.harris.tugas1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val randomBtn: Button = findViewById(R.id.btn)
        randomBtn.setOnClickListener {
            randomBtn()
        }
    }

    private fun randomBtn() {
        val cowok = Random().nextInt(4) + 1
        val cewek = Random().nextInt(4) + 1

        val imgCowok = when (cowok) {
            1->R.drawable.lk1
            2->R.drawable.lk2
            3->R.drawable.lk3
            4->R.drawable.lk4
            else->R.drawable.lk5
        }
        val imgCewek = when (cewek) {
            1->R.drawable.cw1
            2->R.drawable.cw2
            3->R.drawable.cw3
            4->R.drawable.cw4
            else->R.drawable.cw5
        }
        img1.setImageResource(imgCowok)
        img2.setImageResource(imgCewek)
    }
}
