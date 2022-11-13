package com.example.navigationui.screens

import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeOne () {
    OutlinedTextField(
        value = "Home One: We are at the Home Dashboard",
        onValueChange = {""} )
}


@Preview
@Composable
fun PreviewHomeOne (){
    HomeOne()
}