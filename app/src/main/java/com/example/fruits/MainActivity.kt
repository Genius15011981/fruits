package com.example.fruits

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.fruits.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var fruits= arrayListOf("Ananas", "Anor", "Avakado", "Banan", "Chernika", "Drakon", "Gilos", "Quavi","Lichi",
        "Limon", "Longan", "Malina", "mango", "Nok", "Olma")
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter=ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,fruits)
        binding.listView.adapter=adapter
        binding.listView.setOnItemClickListener{_,_,position,_->
            Toast.makeText(this,"${fruits[position]} tanlandi",Toast.LENGTH_SHORT).show()
            Intent(this, FruitIImageActivity::class.java).apply {
                this.putExtra("position", position)
                startActivity(this)
            }
        }
    }

}