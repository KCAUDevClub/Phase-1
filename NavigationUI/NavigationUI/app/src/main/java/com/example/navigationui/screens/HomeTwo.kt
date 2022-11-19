package com.example.navigationui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.AnnotatedString
import androidx.navigation.NavHostController
import com.example.navigationui.Routes

@Composable
fun HomeTwo (navController: NavHostController){
Column() {
    OutlinedTextField(
        value = "Home Two: Dashboard Two",
        onValueChange = {""}
    )
    ClickableText(
        text = AnnotatedString("Go to Screen Three"),
        onClick = { navController.navigate(Routes.HomeThree.route)}
    )

}
}