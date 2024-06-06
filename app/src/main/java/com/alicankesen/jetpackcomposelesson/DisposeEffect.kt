package com.alicankesen.jetpackcomposelesson

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun PageTransition() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "disposeEffect") {
        composable(route = "disposeEffect") {
            DisposeEffect(navController = navController)
        }
        composable(route = "secondPage") {
            SecondPage(navController = navController)
        }
    }
}

@Composable
fun SecondPage(navController: NavController) {
    Column {
        Button(onClick = { navController.popBackStack() }) {
            Text(text = "Geri Dön")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DisposeEffect(navController: NavController) {
    var name by remember {
        mutableStateOf("")
    }
    DisposableEffect(key1 = name) {
        println("effect")
        onDispose {
            println("onDispose")
        }
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
    ) {
        Text(text = name)
        TextField(value = name, onValueChange = { name = it })
        Button(onClick = {
            navController.navigate("secondPage")
        }) {
            Text(text = "İlerle")
        }
    }
}
