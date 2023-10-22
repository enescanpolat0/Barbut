package com.enescanpolat.barbut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.enescanpolat.barbut.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    lateinit var imageView1: ImageView
    lateinit var imageView2: ImageView

    val diceimages:IntArray= intArrayOf(
        R.drawable.diceone,
        R.drawable.dicetwo,
        R.drawable.dicethree,
        R.drawable.dicefour,
        R.drawable.dicefive,
        R.drawable.dicesix
    )
    lateinit var random:Random

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        random=Random

        imageView1=binding.imageview1
        imageView2=binding.imageview2

        binding.zarat.setOnClickListener {

            imageView1.setImageResource(diceimages[random.nextInt(diceimages.size)])
            imageView2.setImageResource(diceimages[random.nextInt(diceimages.size)])

        }


    }
}