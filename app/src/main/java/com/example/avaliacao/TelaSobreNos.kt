package com.example.avaliacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.avaliacao.databinding.ActivityMainBinding
import com.example.avaliacao.databinding.ActivityTelaSobreNosBinding

class TelaSobreNos : AppCompatActivity() {

    private lateinit var binding: ActivityTelaSobreNosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_tela_sobre_nos)

        binding = ActivityTelaSobreNosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edButton = binding.button2

        edButton.setOnClickListener{
            val intent = Intent(this,formulario::class.java)
            startActivity(intent)
        }
    }
}