package com.example.imagesversactivites

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.imagesversactivites.databinding.PersonneItemBinding

class PersonneAdapter : ListAdapter<Personne, PersonneAdapter.PersonneItemViewHolder>(PersonneItemDiffCallback) {

    // binding nous permet d'accéder à tout le champs de notre layout personne_item.xml
    inner class PersonneItemViewHolder(private val binding: PersonneItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(personne: Personne) {
            binding.tvdes.text = personne.des
            binding.tvNom.text = personne.nom

            binding.tvNom.setOnClickListener {
                val intent = Intent(binding.root.context, test::class.java)
                // Passer l'ID du sujet à l'activité de vote
                binding.root.context.startActivity(intent)
                intent.putExtra("sujet",personne.nom)
                intent.putExtra("descr",personne.des)
            }
            // Passer l'ID du sujet à l'activité de vote


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonneItemViewHolder {
        val binding: PersonneItemBinding = PersonneItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PersonneItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonneItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

object PersonneItemDiffCallback : DiffUtil.ItemCallback<Personne>() {
    override fun areItemsTheSame(oldItem: Personne, newItem: Personne): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Personne, newItem: Personne): Boolean {
        return oldItem.nom == newItem.nom &&
                oldItem.des == newItem.des

    }
}
