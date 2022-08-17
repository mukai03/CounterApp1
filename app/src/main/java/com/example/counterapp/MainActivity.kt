package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.counterapp.databinding.ActivityMainBinding
import com.example.counterapp.viewmodel.CounterViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var vm :CounterViewModel
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        vm = ViewModelProvider(this).get(CounterViewModel::class.java)

        vm.result.observe(this){
            binding.tvCount.text = it
            Log.e("ololo", "onCreate: ", )
        }
        binding.btnIncrement.setOnClickListener {
            vm.increment()
            Log.e("ololo", "+: ", )

        }
        binding.btnDecrement.setOnClickListener {
            vm.decrement()
            Log.e("ololo", "-: ", )

        }
    }
}