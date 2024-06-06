package com.alicankesen.jetpackcomposelesson

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LazyGridExample() {

    val animal = listOf<Animal>(
        Animal("kedi", 12),
        Animal("köpek", 2),
        Animal("fil", 23),
        Animal("tilki", 10),
        Animal("fare", 12),
        Animal("zürafa", 44),
        Animal("maymun", 5),
        Animal("yılan", 7),
    )

    LazyVerticalGrid(columns = GridCells.Fixed(3)) {
        items(animal) { animal ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(15.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                ) {
                    Text(text = animal.name)
                    Text(text = animal.age.toString())
                }
            }

        }
    }
}