package com.example.navigationui

sealed class Routes (val route: String) {
    object HomeOne : Routes("home_one")
    object HomeTwo: Routes("home_two")
}
