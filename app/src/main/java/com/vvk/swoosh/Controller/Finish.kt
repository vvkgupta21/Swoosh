package com.vvk.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vvk.swoosh.EXTRA_LEAGUE
import com.vvk.swoosh.EXTRA_SKILL
import com.vvk.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class Finish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        looking.text = "Looking for $league $skill league near you..."
    }
}