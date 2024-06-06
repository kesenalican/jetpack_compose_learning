package com.alicankesen.jetpackcomposelesson

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample() {
    Scaffold(
        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = { println("fab tıklanıd") },
                containerColor = Color.Red,
                contentColor = Color.White,

                ) {
                Icon(Icons.Filled.Add, contentDescription = "")
                Text(text = "Tıkla")

            }
        },
        content = {
            Column(modifier = Modifier.padding(it)) {

            }
        }
    )
}