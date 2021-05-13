package com.moochies.guessinggame

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_end_game.*
import kotlinx.android.synthetic.main.activity_tela_reinicar_sair.*
import kotlinx.android.synthetic.main.dialog_view.*

class TelaReinicarSair : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_reinicar_sair)


        val count = intent.getIntExtra("resultado", 0)
        lblResfinal.text = count.toString()

        btnSair.setOnClickListener {
            openConfirm()
        }


        btnReiniciar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            finish()
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



