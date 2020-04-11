package com.vvk.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.vvk.swoosh.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getstartedbtn.setOnClickListener {
            val leagueIntent = Intent(this, league_activity::class.java)
            startActivity(leagueIntent)
        }
    }
}