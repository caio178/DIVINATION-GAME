package com.moochies.guessinggame

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.postDelayed
import kotlinx.android.synthetic.main.activity_end_game.*

class EndGame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end_game)

        val v = intent.getIntExtra("valor", 0)
        val count = intent.getIntExtra("resultado",0)
        lblResNum.text = v.toString()
        Handler().postDelayed({
            val it =  Intent(this, TelaReinicarSair::class.java)
            it.putExtra("resultado",count)
            startActivity(it)






            },4000)

    }
}