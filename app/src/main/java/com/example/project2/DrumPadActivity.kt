package com.example.project2

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_drum_pad.*

class DrumPadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drum_pad)

        var mp1 = MediaPlayer.create(this, R.raw.snare)
        var mp2 = MediaPlayer.create(this, R.raw.tom)
        var mp3 = MediaPlayer.create(this, R.raw.hardkick)
        var mp4 = MediaPlayer.create(this, R.raw.openhat)
        var mp5 = MediaPlayer.create(this, R.raw.ride)
        var mp6 = MediaPlayer.create(this, R.raw.heavysnare)
        var mp7 = MediaPlayer.create(this, R.raw.singlesnare)
        var mp8 = MediaPlayer.create(this, R.raw.conga1)
        var mp9 = MediaPlayer.create(this, R.raw.cowbell)
        var mp10 = MediaPlayer.create(this, R.raw.crashcym)
        var mp11 = MediaPlayer.create(this, R.raw.hiconga)
        var mp12 = MediaPlayer.create(this, R.raw.openhh)

        activityBtn.setOnClickListener {
            startActivity((Intent(this, MainActivity::class.java)))
        }

    }

}
