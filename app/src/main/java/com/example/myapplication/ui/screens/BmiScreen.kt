package com.example.myapplication.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapplication.ui.viewmodels.ViewModel

@Composable
fun BmiScreen(
    modifier: Modifier = Modifier,
    bmiViewModel: ViewModel = viewModel()
) {
    Column(
        modifier = modifier.padding(all = 8.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "BMI Calculator",
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.secondary,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth().padding(top = 40.dp)

        )

        OutlinedTextField(
            value = bmiViewModel.heightInput,
            onValueChange = { bmiViewModel.heightInput = it },
            label = { Text("Height") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = bmiViewModel.weightInput,
            onValueChange = { bmiViewModel.weightInput = it },
            label = { Text("Weight") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )

        Text(
            text = "Your Body Mass Index Is: ${bmiViewModel.bmi}",
            fontSize = 18.sp,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

