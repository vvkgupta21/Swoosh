package com.vvk.swoosh

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_LEAGUE = "League"
const val EXTRA_SKILL = "skill"

class loading_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
    }
}