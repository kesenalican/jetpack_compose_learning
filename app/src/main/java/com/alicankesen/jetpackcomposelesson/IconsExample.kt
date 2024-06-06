package com.alicankesen.jetpackcomposelesson

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun IconsExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Icon(Icons.Filled.Person, contentDescription = "", Modifier.clickable {
            println("bas")
        })
        IconButton(onClick = {
            println("icona tıklandı")
        }) {
            Icon(Icons.Filled.Menu, contentDescription = "")

        }
        OutlinedIconButton(onClick = {
            println("add iconu çalıştı")
        }) {
            Icon(Icons.Filled.Add, contentDescription = "")


        }
    }
}
