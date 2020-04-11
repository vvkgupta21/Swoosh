package com.vvk.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.vvk.swoosh.EXTRA_LEAGUE
import com.vvk.swoosh.EXTRA_SKILL
import com.vvk.swoosh.R
import kotlinx.android.synthetic.main.activity_i_am.*

class i_am : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_i_am)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun OnBallerClicked(view: View){
        begginerSkillBtn.isChecked = false
        skill = "begginer"

    }

    fun OnBegginerClicked(view: View){
        ballerSkillBtn.isChecked = false
        skill = "baller"
    }

    fun OnSkillFinishClicked(view: View){
        if (skill != ""){
            val finishActivity = Intent(this, Finish::class.java )
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)

            startActivity(finishActivity)
    }else
    {
        Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
    }

    }
}