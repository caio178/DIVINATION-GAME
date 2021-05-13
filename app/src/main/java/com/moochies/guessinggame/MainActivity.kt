package com.moochies.guessinggame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        int components

        val valorMin = 1
        val valorMax = (1 + Math.random() * (201 - 1)).toInt()

        lblFrase.text = "I will think of a number between $valorMin and $valorMax, try to guess"


        var v = 0
        var count=0;


        btnMenos.setOnClickListener {

            if (v == 1) {
                return@setOnClickListener
            }
            v -= 1
            lblValor.text = v.toString()
        }

        btnMais.setOnClickListener {
            v += 1
            lblValor.text = v.toString()


        }
 

        var n = 1 + Math.random() * (valorMax)
         var valor = n.toInt()




        btnClick.setOnClickListener {
            count +=1




//        funcao do botao



            val num = v
            var res = ""


            if (v > valor) {
                res = "It´s lower number!"
            } else if (v < valor) {
                res = "It´s higher number!"

            } else {
                n = 1 + Math.random() * (valorMax)
                valor = n.toInt()



                    val it =  Intent(this, EndGame::class.java)
                 it.putExtra("resultado",count)
                    it.putExtra("valor", v)
                    startActivity(it)
















            }



            lblFrase.text = res
        }


    }
}