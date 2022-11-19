package com.example.navigationui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.navigation.NavHostController
import com.example.navigationui.Routes


@Composable
fun HomeThree(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Screen Three")
        // To Home 1
        ClickableText(
            text = AnnotatedString("Click to Go to Home 1") ,
            onClick =  { navController.navigate(Routes.HomeOne.route) }
        )
        // To Home 2
        ClickableText(
            text = AnnotatedString("Click to Go to Home 2") ,
            onClick =  { navController.navigate(Routes.HomeTwo.route) }
        )

    }

}