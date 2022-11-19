package com.example.navigationui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.navigation.NavHostController
import com.example.navigationui.Routes

@Composable
fun HomeTwo (navController: NavHostController){
Column(
    modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center

) {
    OutlinedTextField(
        value = "Home 2 Screen",
        onValueChange = {""}
    )
    // To Home 3
    ClickableText(
        text = AnnotatedString("Click to Go to Home 3"),
        onClick = { navController.navigate(Routes.HomeThree.route)}
    )
    // To Home 1
    ClickableText(
        text = AnnotatedString("Click to Go to Home 1") ,
        onClick =  { navController.navigate(Routes.HomeOne.route) }
    )

}
}