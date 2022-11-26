package com.example.yoloooo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSitioWeb = findViewById<Button>(R.id.buttonSitioWeb)
        buttonSitioWeb.setOnClickListener{
            //Toast.makeText(this, "Funcionalidad sin implementar", Toast.LENGTH_LONG).show()
            val url = "www.google.com"
            val intentWeb = Intent()
            intentWeb.action = Intent.ACTION_VIEW
            intentWeb.data = Uri.parse("https://" + url)
            startActivity(intentWeb)
        }

        val buttonObtenerSoporte = findViewById<Button>(R.id.buttonObtenerSoporte)
        buttonObtenerSoporte.setOnClickListener{
            //Toast.makeText(this, "Funcionalidad sin implementar", Toast.LENGTH_LONG).show()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.data = Uri.parse("mailto")
            intent.type = "text/plain"

            intent.putExtra(Intent.EXTRA_EMAIL, "hola")
            intent.putExtra(Intent.EXTRA_SUBJECT, "pedrl.rf@gmail.com")
            startActivity(intent)



        }

        val buttonVolver = findViewById<Button>(R.id.buttonVolver)
        buttonVolver.setOnClickListener{
            //Toast.makeText(this, "Funcionalidad sin implementar", Toast.LENGTH_LONG).show()
            finish()
        }
    }
}
