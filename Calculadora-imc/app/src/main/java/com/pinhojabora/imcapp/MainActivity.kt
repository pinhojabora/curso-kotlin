package com.pinhojabora.imcapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.imc_calculator.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.imc_calculator)
        setListeners()

    }

    private fun setListeners() {
        alturaEDT.doAfterTextChanged { text ->
            titleTXT.text = text
        }

        pesoEDT?.doOnTextChanged { text, _, _, _ ->
            titleTXT.text = text
        }
        calcularBTN?.setOnClickListener {
            calcularIMC(pesoEDT.text.toString(), alturaEDT.text.toString())


        }

    }

    private fun calcularIMC (peso: String, altura: String) {
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        if (peso != null && altura != null) {
            val imc = peso / (altura * altura)
            titleTXT.text= ("Seu IMC é $imc")
        }
    }
}






