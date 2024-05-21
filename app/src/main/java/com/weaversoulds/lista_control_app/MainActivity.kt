package com.weaversoulds.lista_control_app
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.INGRESAR)
        button.setOnClickListener {
            showToastMessage()
        }
        val button2: Button = findViewById(R.id.REGISTRARSE)
            button.setOnClickListener {
                showToastMessage()
        }
    }

    private fun showToastMessage() {
        Toast.makeText(this, "hecho", Toast.LENGTH_SHORT).show()
    }
}
