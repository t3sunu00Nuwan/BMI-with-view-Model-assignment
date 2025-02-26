package com.example.myapplication.ui.viewmodels


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel() {

    var heightInput: String by mutableStateOf("")
    var weightInput: String by mutableStateOf("")

    private val height: Float
        get() = heightInput.toFloatOrNull() ?: 0.0f
    private val weight: Int
        get() = weightInput.toIntOrNull() ?: 0

    val bmi: Float
        get() = if (weight > 0 && height > 0) {
            val bmiValue = weight / (height * height)
            "%.1f".format(bmiValue).toFloat()
        } else {
            0.0f
        }

}