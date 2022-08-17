package com.example.counterapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel :ViewModel(){
    val result  = MutableLiveData<String>()
    private var count = 0

    fun increment(){
        ++count
        result.value = count.toString()
    }

    fun decrement(){
        --count
        result.value = count.toString()
    }
}