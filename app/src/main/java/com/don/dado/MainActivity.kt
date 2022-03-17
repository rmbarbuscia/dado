package com.don.dado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Criamos uma referencia do buttonD6

        val buttonD6 = findViewById<Button>(R.id.buttonD6)
        val button12 = findViewById<Button>(R.id.button12)
        val button20 = findViewById<Button>(R.id.button20)

       buttonD6.setOnClickListener{
           rolarDados(6)}

        button12.setOnClickListener{
            rolarDados(12)}

        button20.setOnClickListener{
            rolarDados(20)}
    }
    fun rolarDados(lados: Int){
        // 1 até numeroLados
        val valor = (1..lados).random()

        //Armazenando a referencia do textResultado em uma variável
        val textResultado = findViewById<TextView>(R.id.textDado)

        //Mudamos o texto com o atributo text
        textResultado.text = valor.toString()


    }
}
