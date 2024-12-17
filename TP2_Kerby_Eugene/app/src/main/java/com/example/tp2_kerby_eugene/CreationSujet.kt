package com.example.tp2_kerby_eugene

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tp2_kerby_eugene.databinding.ActivityCreationSujetBinding

class CreationSujet : AppCompatActivity() {
    private lateinit var binding: ActivityCreationSujetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreationSujetBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var title = "Nouveau sujet"
        setTitle(title)
        binding.btnAjouter.setOnClickListener {
            // On crée l'intent, qui a besoin :
            // 1. Du contexte actuel
            // 2. De la classe d'activité à démarrer.
            val monIntent = Intent(this,MainActivity::class.java)

            // On démarre l'activité en lui passant l'intent qu'on vient de créer.
            startActivity(monIntent)
        }

    }


}


