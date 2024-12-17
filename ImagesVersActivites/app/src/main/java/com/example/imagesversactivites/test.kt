package com.example.imagesversactivites

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.imagesversactivites.databinding.ActivityTestBinding

class test :  AppCompatActivity() {
    private lateinit var binding: ActivityTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Récupérer les données de l'Intent
        val nom = intent.getStringExtra("nom")
        val des = intent.getStringExtra("des")

        // Mettre à jour le TextView
        binding.sujetTextView.text = "Nom : $nom\nDescription : $des"
    }
}