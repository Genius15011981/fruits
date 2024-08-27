package com.example.fruits

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.fruits.databinding.ActivityFruitImageBinding

class FruitIImageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFruitImageBinding
    private var fruitList= arrayListOf("Ananas", "Anor", "Avakado", "Banan", "Chernika", "Drakon", "Gilos", "Quavi","Lichi",
        "Limon", "Longan", "Malina", "mango", "Nok", "Olma")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFruitImageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val position=intent.getIntExtra("posiion",0)
        supportActionBar?.title=fruitList[position]
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.imageView.setImageResource(R.drawable.ananas)
        when(position){
            0->binding.imageView.setImageResource(R.drawable.ananas)
            1->binding.imageView.setImageResource(R.drawable.anor)
            2->binding.imageView.setImageResource(R.drawable.avakado)
            3->binding.imageView.setImageResource(R.drawable.banan)
            4->binding.imageView.setImageResource(R.drawable.chernika)
            5->binding.imageView.setImageResource(R.drawable.drakon)
            6->binding.imageView.setImageResource(R.drawable.gilos)
            7->binding.imageView.setImageResource(R.drawable.guavi)
            8->binding.imageView.setImageResource(R.drawable.lichi)
            9->binding.imageView.setImageResource(R.drawable.limon)
            10->binding.imageView.setImageResource(R.drawable.longan)
            11->binding.imageView.setImageResource(R.drawable.malina)
            12->binding.imageView.setImageResource(R.drawable.mango)
            13->binding.imageView.setImageResource(R.drawable.nok)
            14->binding.imageView.setImageResource(R.drawable.olma)


        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId==android.R.id.home)
            finish()
        return super.onOptionsItemSelected(item)
    }
}