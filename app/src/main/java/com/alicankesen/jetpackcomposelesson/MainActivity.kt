package com.alicankesen.jetpackcomposelesson

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.alicankesen.jetpackcomposelesson.ui.theme.JetpackComposeLessonTheme
import com.alicankesen.jetpackcomposelesson.ui.theme.MyText
import com.alicankesen.jetpackcomposelesson.ui.theme.MyTextField

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeLessonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    //PageNavigator()
                    LaunchEffect()
                }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
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

@Composable
fun PageNavigator() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "first_page") {
        composable(route = "first_page") {
            FirstPage(navController)
        }
        composable(
            route = "second_page" + "?name={name}&age={age}", arguments = listOf(
                navArgument(name = "name") {
                    type = NavType.StringType
                    defaultValue = ""
                },
                navArgument(name = "age") {
                    type = NavType.IntType
                    defaultValue = 0
                }
            )
        ) {
            val name = it.arguments?.getString("name")!!
            val age = it.arguments?.getInt("age")!!
            SecondPage(navController, name, age)
        }
        composable(route = "third_page") {
            ThirdPage(navController)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeLessonTheme {
        PageNavigator()
    }
}