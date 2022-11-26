package com.example.yoloooo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pantallaPelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_pelicula)

        var botonSalir : Button =  findViewById(R.id.bt_salir)
        var botonPeliculaA : Button = findViewById(R.id.bt_peliculaA)
        var botonpeliculaB : Button  =  findViewById(R.id.bt_peliculaB)

        botonPeliculaA.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        botonpeliculaB.setOnClickListener{
            val intent2 = Intent(this, PeliculaAA::class.java)
            startActivity(intent2)
        }

        botonSalir.setOnClickListener {
            finish()
        }

    }
}