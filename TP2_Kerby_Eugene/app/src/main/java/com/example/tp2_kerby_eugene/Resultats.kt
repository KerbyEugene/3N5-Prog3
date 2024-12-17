package com.example.tp2_kerby_eugene

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tp2_kerby_eugene.databinding.ActivityCreationSujetBinding
import com.example.tp2_kerby_eugene.databinding.ActivityResultatsBinding

class Resultats : AppCompatActivity() {
    private lateinit var binding: ActivityResultatsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding=ActivityResultatsBinding.inflate(layoutInflater)
        setContentView((binding.root))
        var title ="Stats"
        setTitle(title)
    }
}