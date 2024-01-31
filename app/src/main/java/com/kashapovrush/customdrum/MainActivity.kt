package com.kashapovrush.customdrum

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.kashapovrush.customdrum.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.startRotatingBtn.setOnClickListener {
            binding.imageFromUrl.visibility = View.INVISIBLE
            binding.redText.visibility = View.INVISIBLE
            binding.violetText.visibility = View.INVISIBLE
            binding.yellowText.visibility = View.INVISIBLE
            binding.lightBlueText.visibility = View.INVISIBLE
            val randomAngle = Random.nextFloat() * 1000
            binding.customDrum.animate().rotation(randomAngle).start()
            val angle = randomAngle % 360
            when (360 - angle) {
                in 0f..51.429f -> {
                    binding.redText.visibility = View.VISIBLE
                }
                in 51.429f .. 102.858f -> {
                    setImage()
                }
                in 102.858f .. 154.287f -> {
                    binding.yellowText.visibility = View.VISIBLE
                }
                in 154.287f .. 205.716f -> {
                    setImage()
                }
                in 205.716f .. 257.145f -> {
                    setImage()
                }
                in 257.145f .. 308.574f -> {
                    binding.lightBlueText.visibility = View.VISIBLE

                }
                in 308.574f .. 360f -> {
                    binding.violetText.visibility = View.VISIBLE

                }
            }
        }

        binding.resetBtn.setOnClickListener {
            binding.imageFromUrl.visibility = View.INVISIBLE
            binding.redText.visibility = View.INVISIBLE
            binding.violetText.visibility = View.INVISIBLE
            binding.yellowText.visibility = View.INVISIBLE
            binding.lightBlueText.visibility = View.INVISIBLE
        }

    }

    private fun setImage() {
        binding.imageFromUrl.visibility = View.VISIBLE
        Picasso.get()
            .load("https://loremflickr.com/640/360")
            .into(binding.imageFromUrl)
    }
}