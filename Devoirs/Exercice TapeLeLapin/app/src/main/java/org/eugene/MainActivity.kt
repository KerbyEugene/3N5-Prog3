package org.eugene

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.eugene.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

   private lateinit var binding : ActivityMainBinding;

    private lateinit var listeBoutons:List<Button>
    var scoretoops= 0
    var scoreflops=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.tvTops.setOnClickListener(View.OnClickListener {
            println("salut")
            binding.tvTops.setText("Lapin")
        })
        listeBoutons= listOf(
            binding.btn1,
            binding.btn2,
            binding.btn3,
            binding.btn4,
            binding.btn5,
            binding.btn6,
            binding.btn7,
            binding.btn8,
            binding.btn9,
        )
        for(btn in listeBoutons){
            btn.setOnClickListener(View.OnClickListener{
                click(it)
            })
        }
        initialiser()
    }
    fun initialiser(){
        for (btn in listeBoutons){
            btn.setText("taupe")
        }
        //choisir le lapin au hasard
        val boutonLapin:Button=listeBoutons.random()
        boutonLapin.setText("Lapin")
        //mettre le reste taupe
    }
    fun click(it:View){
//detecter si cest lapin
        val buttonclick:Button=it as Button
        if(buttonclick.text=="Lapin"){
            buttonclick.setText("Taupe")
            scoretoops++
            initialiser()
        }else{
            //calcule des score
            scoreflops++
        }
    binding.tvTops.setText("Tops:$scoretoops")
        binding.Flops.setText("Flops:$scoreflops")




    }
}



