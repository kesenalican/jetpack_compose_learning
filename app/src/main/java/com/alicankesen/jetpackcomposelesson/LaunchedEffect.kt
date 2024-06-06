package com.alicankesen.jetpackcomposelesson

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun LaunchEffect() {
    var name by remember {
        mutableStateOf("")
    }
    var count by remember {
        mutableStateOf(0)
    }
    LaunchedEffect(key1 = name) {
        count++
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
    ) {
        Text(text = count.toString(), fontSize = 25.sp)
        TextField(value = name, onValueChange = { name = it })
    }
}