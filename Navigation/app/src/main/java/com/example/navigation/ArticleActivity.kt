package com.example.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.navigation.databinding.ActivityAccueilBinding
import android.content.Intent
import com.example.navigation.databinding.ActivityArticleBinding

class ArticleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityArticleBinding // Utilisez le bon nom du binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityArticleBinding.inflate(layoutInflater) // Correction ici
        setContentView(binding.root)

        // Vous pouvez maintenant accéder aux vues via binding
        title="Article"

        binding.btnMonContact.setOnClickListener{

            val monIntent=Intent(this,ContactActivity::class.java)
            startActivity(monIntent)
        }

    }

}