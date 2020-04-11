package com.vvk.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.vvk.swoosh.EXTRA_LEAGUE
import com.vvk.swoosh.R
import kotlinx.android.synthetic.main.activity_league_activity.*

class league_activity : BaseActivity() {

    var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league_activity)
    }

    fun OnMensClicked(view: View){
        WomensLeagueBtn.isChecked = false
        CoedLeagueBtn.isChecked = false
        selectedLeague = "mens"
    }

    fun OnWomensClicked(view: View){
        MensLeagueBtn.isChecked = false
        CoedLeagueBtn.isChecked = false
        selectedLeague = "womens"
    }

    fun OnCoedClicked(view: View){
        MensLeagueBtn.isChecked = false
        WomensLeagueBtn.isChecked = false
        selectedLeague = "Co-ed"

    }

    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val skillActivity = Intent(this, i_am::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please Select a League", Toast.LENGTH_SHORT).show()
        }
    }
}