package com.example.imagesversactivites

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.imagesversactivites.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: PersonneAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Yo mama !"
        setupRecycler()
        fillRecycler()
    }
    private fun setupRecycler() {
        adapter = PersonneAdapter() // Créer l'adapteur
        binding.rvPersonneAdapter.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.rvPersonneAdapter.setHasFixedSize(true) // Option pour améliorer les performances
        binding.rvPersonneAdapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.rvPersonneAdapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }
    private fun fillRecycler() {
        val items: MutableList<Personne> = mutableListOf()
        items.add(Personne("andoid 1.1","petit four"))
        items.add(Personne("andoid 1.2","petit four"))
        items.add(Personne("andoid 1.1","petit four"))
        items.add(Personne("andoid 1.1","petit four"))
        items.add(Personne("andoid 1.1","petit four"))
        items.add(Personne("andoid 1.1","petit four"))
        items.add(Personne("andoid 1.1","petit four"))
        items.add(Personne("andoid 1.1","petit four"))
        items.add(Personne("andoid 1.1","petit four"))
        items.add(Personne("andoid 1.1","petit four"))
        items.add(Personne("andoid 1.1","petit four"))
        items.add(Personne("andoid 1.1","petit four"))
        items.add(Personne("andoid 1.1","petit four"))
        items.add(Personne("andoid 1.1","petit four"))
        items.add(Personne("andoid 1.1","petit four"))
        items.add(Personne("andoid 1.1","petit four"))
        items.add(Personne("andoid 1.1","petit four"))
        items.add(Personne("andoid 1.1","petit four"))
        items.add(Personne("andoid 1.1","petit four"))
        items.add(Personne("andoid 1.1","petit four"))


        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
    }
