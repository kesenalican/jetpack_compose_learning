package com.alicankesen.jetpackcomposelesson

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun FirstPage(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        val name = "alican"
        val age = 25
        Text(text = "Sayfa 1")
        Button(onClick = {
            navController.navigate("second_page"+ "?name=${name}&age=${age}")
        }) {
            Text(text = "Next Page")
            
        }
    }
}