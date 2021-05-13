package com.moochies.guessinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_tela_alerta_dialog.*
import kotlinx.android.synthetic.main.dialog_view.view.*

class TelaAlertaDialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_alerta_dialog)

        btnPlayAlert.setOnClickListener {

           val view = View.inflate( this@TelaAlertaDialog, R.layout.dialog_view, null)

            val builder = AlertDialog.Builder(this@TelaAlertaDialog)
            builder.setView(view)

            val dialog = builder.create()
            dialog.show()
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
            dialog.setCancelable(false)

            view.btnCorfim.setOnClickListener {
                dialog.dismiss()
            }
        }
    }
}