package com.example.fruits

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.fruits.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var fruits= arrayListOf<FruitModel>(
        FruitModel("Ananas",R.drawable.olma),
        FruitModel("Anor", R.drawable.anor),
        FruitModel("Avakado",R.drawable.avakado),
        FruitModel("Banan", R.drawable.banan),
        FruitModel("Chernika", R.drawable.chernika),
        FruitModel("Drakon", R.drawable.drakon),
        FruitModel("Gilos", R.drawable.gilos),
        FruitModel("Quavi", R.drawable.guavi),
        FruitModel("Lichi", R.drawable.lichi),
        FruitModel("Limon", R.drawable.limon),
        FruitModel("Longan", R.drawable.longan),
        FruitModel("Malina", R.drawable.malina),
        FruitModel("mango", R.drawable.mango),
        FruitModel("Nok", R.drawable.nok),
        FruitModel("Olma",  R.drawable.olma)
    )

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter=CustomAdapter(this,fruits)
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