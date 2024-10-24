package com.example.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.navigation.databinding.ActivityAccueilBinding
import android.content.Intent

class AccueilActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAccueilBinding // Utilisez le bon nom du binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAccueilBinding.inflate(layoutInflater) // Correction ici
        setContentView(binding.root)

        // Vous pouvez maintenant accéder aux vues via binding
       title="Accueil"

        binding.btnMonBouton.setOnClickListener{

            val monIntent=Intent(this,ArticleActivity::class.java)
            startActivity(monIntent)
        }

        binding.btnMonContact.setOnClickListener{

            val monIntent=Intent(this,ContactActivity::class.java)
            startActivity(monIntent)
        }

      binding.picker1.maxValue=10
        binding.picker1.minValue=1

    }

}
