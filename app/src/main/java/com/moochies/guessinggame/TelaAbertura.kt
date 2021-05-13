package com.moochies.guessinggame

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_tela_abertura.*

class TelaAbertura : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_abertura)

        Glide.with(this)
            .asGif()
            .load(R.raw.ic_abertura_gif)
            .into(imageView3)


        Handler().postDelayed({
            val it =  Intent(this, TelaInicial::class.java)
            startActivity(it)

        },4000)



    }
    }
