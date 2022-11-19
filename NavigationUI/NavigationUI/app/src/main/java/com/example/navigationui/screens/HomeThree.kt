package com.example.navigationui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.AnnotatedString
import androidx.navigation.NavHostController
import com.example.navigationui.Routes


@Composable
fun HomeThree(navController: NavHostController) {
    Column() {
        Text(text = "Screen Three")

        ClickableText(
            text = AnnotatedString("Go to Home Screen One") ,
            onClick =  { navController.navigate(Routes.HomeOne.route) }
        )

    }

}