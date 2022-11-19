package com.example.navigationui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.navigationui.Routes

@Composable
fun HomeOne( navController: NavHostController ) {
Column() {
    OutlinedTextField(
        value = "Home One: We are at the Home Dashboard",
        onValueChange = {""} )
    
    ClickableText(
        text = AnnotatedString("Home Two"),
        onClick = { navController.navigate(Routes.HomeTwo.route)},
        style = TextStyle(
            fontSize = 14.sp,
            fontFamily = FontFamily.Default
        )
    )
    
}
}
