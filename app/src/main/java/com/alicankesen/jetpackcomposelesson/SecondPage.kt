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
fun SecondPage(navController: NavController, name:String, age:Int){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = name)
        Text(text = age.toString())
        Text(text = "Sayfa 2")
        Button(onClick = {
            navController.navigate("third_page"){
                // STACKTEN SİL
                /*popUpTo("second_page"){
                    inclusive= true
                }*/
            }
        }) {
            Text(text = "İleri")
        }
        Button(onClick = {
            navController.navigate("first_page"){
                // STACKTEN SİL
                /*popUpTo("second_page"){
                    inclusive= true
                }*/
            }
        }) {
            Text(text = "Geri")
        }
    }
}