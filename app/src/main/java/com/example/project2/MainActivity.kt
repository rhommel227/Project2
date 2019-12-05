package com.example.project2

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mpsnare = MediaPlayer.create(this, R.raw.snare)
        var mphihat = MediaPlayer.create(this, R.raw.openhat)
        var mpride = MediaPlayer.create(this, R.raw.ride)
        var mpsub = MediaPlayer.create(this, R.raw.hardkick)
        var mptom = MediaPlayer.create(this, R.raw.tom)

        snareBtn.setOnClickListener{
            mpsnare.start()
        }

        hihatBtn.setOnClickListener{
            mphihat.start()
        }

        rideBtn.setOnClickListener{
            mpride.start()
        }

        bassBtn.setOnClickListener{
            mpsub.start()
        }

        tomBtn.setOnClickListener{
            mptom.start()
        }

        newActivityBtn.setOnClickListener {
            startActivity((Intent(this, DrumPadActivity::class.java)))
        }

    }
}
