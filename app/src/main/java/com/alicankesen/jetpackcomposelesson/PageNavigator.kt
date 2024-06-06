package com.alicankesen.jetpackcomposelesson

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

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
