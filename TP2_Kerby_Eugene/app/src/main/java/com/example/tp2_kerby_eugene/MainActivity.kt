package com.example.tp2_kerby_eugene

import adapters.MonAdapter
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.tp2_kerby_eugene.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MonAdapter // L'adapteur est accessible partout dans notre classe

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupRecycler()
        fillRecycler()

        var title ="Sujet"
        setTitle(title)

        binding.btnAjouterSujet.setOnClickListener {
            // On crée l'intent, qui a besoin :
            // 1. Du contexte actuel
            // 2. De la classe d'activité à démarrer.
            val monIntent = Intent(this,CreationSujet::class.java)

            // On démarre l'activité en lui passant l'intent qu'on vient de créer.
            startActivity(monIntent)
        }
    }
    private fun setupRecycler() {
        adapter = MonAdapter() // Créer l'adapteur
        binding.rvMonAdapter.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.rvMonAdapter.setHasFixedSize(true) // Option pour améliorer les performances
        binding.rvMonAdapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.rvMonAdapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }
    private fun fillRecycler() {
        val items: MutableList<String> = mutableListOf("Quelle est votre plus grande peur ?",
            "Si vous pouviez dîner avec une personne célèbre, qui serait-ce ?",
            "Quel est le meilleur livre que vous ayez jamais lu ?","What is the national sport of Japan?",
            "Which sport is known as 'The Beautiful Game'?",
            "How many players are on a soccer team?",
            "In which sport is the term 'home run' used?",
            "Who holds the record for the most Olympic gold medals?",
            "What is the oldest professional sport in the world?",
            "What is the maximum score in a single frame of bowling?",
            "In which country did baseball originate?",
            "How long is an Olympic swimming pool?",
            "Which sport is often referred to as 'The Sport of Kings'","In which year were the first modern Olympic Games held?",
            "Where were the 2016 Summer Olympics held?",
            "Which city will host the 2028 Summer Olympics?",
            "What color is the middle Olympic ring?",
            "How often are the Winter Olympics held?",
            "Which athlete has won the most Olympic medals overall?",
            "Who was the first woman to win an Olympic medal?",
            "In which sport is the 'clean and jerk' a key event?",
            "What country has won the most Winter Olympic medals?",
            "How many sports were in the 2020 Summer Olympics?","Who won the FIFA World Cup in 2018?",
            "How many minutes are in a regular soccer match?",
            "What is the name of the international soccer governing body?",
            "Who is the all-time leading scorer in World Cup history?",
            "Which player has won the most Ballon d'Or awards?",
            "How many teams participate in the FIFA World Cup?",
            "In which year was the first FIFA World Cup held?",
            "Who was the first African player to win the Ballon d'Or?",
            "What is the term for when a player scores three goals in a game?",
            "What is the maximum number of substitutions allowed in a game?","Who is considered the greatest NBA player of all time?",
            "Which team won the first NBA Championship?",
            "Who holds the record for most points scored in an NBA game?",
            "How many players are on the court for each team in basketball?",
            "What is the height of a standard basketball hoop?",
            "Which country did the game of basketball originate in?",
            "Who has the most NBA Championship rings?",
            "What is the shot clock time in an NBA game?",
            "How many points is a half-court shot worth?",
            "Who was the first player to record a quadruple-double in the NBA?",
        )

        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}




