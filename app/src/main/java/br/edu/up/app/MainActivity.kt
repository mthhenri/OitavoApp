package br.edu.up.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import br.edu.up.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Abordagem declarativa
        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnAlterar.setOnClickListener {
            binding.textView.text = "Texto alterado!"
        }

        //Abordagem imperativa
        /*
        val texto = findViewById<TextView>(R.id.textView)
        val btnAlt = findViewById<Button>(R.id.btnAlterar)

        btnAlt.setOnClickListener(View.OnClickListener {
            texto.text = "Texto alterado!"
        })
        */

    }
}