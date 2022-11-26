package com.example.yoloooo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class PeliculaAA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pelicula_aa)

        var bt_salir : Button = findViewById(R.id.bt_salirPantallaA)
        var bt_peliculaA : Button = findViewById(R.id.bt_botonPeliculaA)

        bt_salir.setOnClickListener {
            finish()
        }

        bt_peliculaA.setOnClickListener {
            Toast.makeText(this, "VAMOS ESE ABSOL", Toast.LENGTH_LONG).show()
        }
    }
}