package com.example.navigationui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationui.Routes

@Composable
fun GraphNavigatorMain() {
    val navController = rememberNavController()
    NavHost(
        navController = navController, startDestination = Routes.HomeOne.route) {
        // we add the other screens here
        // use the composable() { } syntax
        composable(Routes.HomeOne.route) {
            HomeOne(navController = navController)
        }
        composable(Routes.HomeTwo.route) {
            HomeTwo(navController = navController)
        }
        composable(Routes.HomeThree.route) {
            HomeThree(navController = navController)
        }
    }
}

// Now, add the GraphNavigatorMain() {} function to the MainActivity.kt file