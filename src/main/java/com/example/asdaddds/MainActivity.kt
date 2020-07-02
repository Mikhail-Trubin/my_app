package com.example.asdaddds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun toastMe(view: View ) {
        val myToast = android.widget.Toast.makeText(this, "Hello УБ!", android.widget.Toast.LENGTH_SHORT)
        myToast.show()
    }
    fun countMe (view: View) {
        val countString = tet2.text.toString()
        var count: Int = Integer.parseInt(countString)
        count++
        tet2.text = count.toString();
    }

    fun randomMe (view: View) {
        val randomIntent = Intent( this, secondActivity::class.java)
        val countString = tet2.text.toString()
        val count = Integer.parseInt(countString)
        randomIntent.putExtra(secondActivity.TOTAL_COUNT, count)
        startActivity(randomIntent)

    }
}