package com.example.tp2_kerby_eugene

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tp2_kerby_eugene.databinding.ActivityVoteBinding

class Vote : AppCompatActivity() {
    private lateinit var binding: ActivityVoteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityVoteBinding.inflate((layoutInflater))
        setContentView(binding.root)
        var title ="Voter"
        setTitle(title)
    }
}