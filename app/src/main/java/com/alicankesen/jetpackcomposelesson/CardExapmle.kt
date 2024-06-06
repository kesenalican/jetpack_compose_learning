package com.alicankesen.jetpackcomposelesson

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun CardExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
    ) {
        Card(modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(16.dp),
            shape = RoundedCornerShape(10.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Green, contentColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
            border = BorderStroke(width = 1.dp, color = Color.Black)

        ) {
            Text(text = "Filled card", textAlign = TextAlign.Center)
        }
        OutlinedCard(modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(16.dp),
            shape = RoundedCornerShape(10.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Green, contentColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
            border = BorderStroke(width = 1.dp, color = Color.Black)

        ) {
            Text(text = "Filled card", textAlign = TextAlign.Center)
        }
    }
}
