package com.example.navigationui.screens

import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeTwo (){
    OutlinedTextField(
        value = "Home Two: Dashboard Two",
        onValueChange = {""}
    )
}


@Preview
@Composable
fun PreviewHomeTwo() {
    HomeTwo()
}