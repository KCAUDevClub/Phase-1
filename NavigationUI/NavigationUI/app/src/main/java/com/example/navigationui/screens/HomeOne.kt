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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.navigationui.Routes

@Composable
fun HomeOne( navController: NavHostController ) {
Column(
    modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
) {
    OutlinedTextField(
        value = "Home 1 Screen",
        onValueChange = {""} )
    
    // To Home 2
    ClickableText(
        text = AnnotatedString("Click to Go to Home 2"),
        onClick = { navController.navigate(Routes.HomeTwo.route)},
        style = TextStyle(
            fontSize = 14.sp,
            fontFamily = FontFamily.Default
        )
    )
    // To Home 3
    ClickableText(
        text = AnnotatedString("Click to Go to Home 3") ,
        onClick =  { navController.navigate(Routes.HomeThree.route) }
    )

    
}
}
