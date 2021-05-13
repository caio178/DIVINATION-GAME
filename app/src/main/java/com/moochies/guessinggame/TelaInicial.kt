package com.moochies.guessinggame

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_tela_inicial.*
import kotlinx.android.synthetic.main.dialog_view.*

class TelaInicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)

        Glide.with(this)
            .asGif()
            .load(R.raw.ic_azul_gif)
            .into(lblAdivinha)

        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)

        btnExit.setOnClickListener {
            openConfirm()

        }
        btnTela.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }

    }


    fun openConfirm() {
        val dialog = Dialog(this)

        dialog.setContentView(R.layout.dialog_view)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        dialog.btnCorfim?.setOnClickListener {
            finishAffinity()
        }

        dialog.btnCancelAlert?.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
        val window: Window = dialog.window!!
        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)

    }
}