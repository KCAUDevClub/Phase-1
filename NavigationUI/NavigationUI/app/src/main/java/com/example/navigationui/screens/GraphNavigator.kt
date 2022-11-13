package com.example.navigationui

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun GraphNavigatorMain() {
    val navController = rememberNavController()
    NavHost(
        navController = navController, startDestination = Routes.HomeOne.route) {
//        we will add the other screens
        composable(
            route = Routes.HomeOne.route

        )
        {
            composable(
                route = Routes.HomeTwo.route

            )
        }
    }
    

}