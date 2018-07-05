package com.adamgibbs76.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.adamgibbs76.swoosh.R
import com.adamgibbs76.swoosh.Utilities.EXTRA_LEAGUE
import com.adamgibbs76.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueText.text = "Looking for a $league $skill league near you..."
    }
}
