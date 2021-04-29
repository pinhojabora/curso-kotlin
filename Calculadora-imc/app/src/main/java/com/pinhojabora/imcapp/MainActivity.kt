package com.pinhojabora.imcapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.imc_calculator)

    }
    private fun setListeners() {
        alturaEDT?.
        Toast.makeText(this, text.toString().Toast.LENGHT_SHORT).show()
    }
    peso

    private fun CalcularIMC (peso:String, altura:String) {
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        if (peso != null && altura != null) {
            val imc = peso / (altura * altura)
            titleTXT.text = "Seu IMC é".format(imc)
        }
    }

}





