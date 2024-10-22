package com.example.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.navigation.databinding.ActivityAccueilBinding
import android.content.Intent
import com.example.navigation.databinding.ActivityContactBinding

class ContactActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContactBinding // Utilisez le bon nom du binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityContactBinding.inflate(layoutInflater) // Correction ici
        setContentView(binding.root)

        // Vous pouvez maintenant accéder aux vues via binding
        title="Contact"
        binding.btnAccueil.setOnClickListener{

            val monIntent=Intent(this,AccueilActivity::class.java)
            startActivity(monIntent)
        }

    }

}