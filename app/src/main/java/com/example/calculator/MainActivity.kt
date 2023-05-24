package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPlus.setOnClickListener {
            val input1 = binding.eTInput1.text.toString().toInt()
            val input2 = binding.eTInput2.text.toString().toInt()

            binding.ResulttextView.text = (input1 + input2).toString()
        }

        binding.btnMinus.setOnClickListener {
            val input1 = binding.eTInput1.text.toString().toInt()
            val input2 = binding.eTInput2.text.toString().toInt()
            binding.ResulttextView.text = (input1 - input2).toString()
        }

        binding.btnMultiply.setOnClickListener {
            val input1 = binding.eTInput1.text.toString().toInt()
            val input2 = binding.eTInput2.text.toString().toInt()
            binding.ResulttextView.text = (input1 * input2).toString()
        }

        binding.btnDivide.setOnClickListener {
            val input1 = binding.eTInput1.text.toString().toInt()
            val input2 = binding.eTInput2.text.toString().toInt()
            binding.ResulttextView.text = (input1 / input2).toString()
        }

        binding.btnModulo.setOnClickListener {
            val input1 = binding.eTInput1.text.toString().toInt()
            val input2 = binding.eTInput2.text.toString().toInt()
            binding.ResulttextView.text = (input1 % input2).toString()
        }
    }
}