package com.example.project2

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_drum_pad.*

class DrumPadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drum_pad)

        activityBtn.setOnClickListener {
            startActivity((Intent(this, MainActivity::class.java)))
        }



    }

}
