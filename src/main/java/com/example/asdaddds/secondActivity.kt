package com.example.asdaddds


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.textview_random
import kotlinx.android.synthetic.main.activity_second.textViewleb



class secondActivity : AppCompatActivity() {
    companion object {

        const val TOTAL_COUNT = "total_count"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }
    fun showRandomNumber() {

        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        val random = java.util.Random()

        var randomInt = 0


        if (count > 0) {



            randomInt = random.nextInt(count + 1)

        }



        // Display the random number.

        textview_random.text = Integer.toString(randomInt)



        // Substitute the max value into the string resource

        // for the heading, and update the heading

        textViewleb.text = getString(R.string.random_heading, count)

    }

}