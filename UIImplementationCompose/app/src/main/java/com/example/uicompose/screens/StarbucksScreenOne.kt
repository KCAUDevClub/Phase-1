package com.example.uicompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun StarbucksOne() {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(text = "First Screen Working")
        Text(
            text = "Starbucks Coffee",
            style = MaterialTheme.typography.h2,
        )
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column {
                Text(text = "99+")
                Text(text = "All Products")
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column() {
                Text(text = "48")
                Text(text = "Coffee")
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Column() {
                Text(text = "23")
                Text(text = "Food")
            }
            Spacer(modifier = Modifier.padding(5.dp))

        }
        Text(
            text = "Popular Coffee" 
        )
        Row(
        // Images
    ) {
            Card() {
                Column() {
                    // image
                    Image(painter = painterResource(id = androidx.compose.ui.unit.R.drawable.img_1) , contentDescription = "Coffee Image" )

                    Text(text = "Cold Brew")
                    Text(text = "Calories - 230" )
                    Text(text = "$13")

                }

                
            }
            Card() {
                Column(modifier = Modifier.fillMaxWidth()) {
                    // image
                    Text(text = "Cold Brew")
                    Text(text = "Calories - 230")
                    Text(text = "$20")

                }
            }
    }
        // Food
        Text(text = "Food")
        Text(text = "See All")
        Row() {
            // image
            Text(
                text = "Honey BBQ Sriracha Chicken"
            )
            Text(
                text = "$28"
            )

        }
        Row() {
            // image
            Text(
                text = "PB&J Protein Box"
            )
            Text(
                text = "$42"
            )

        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            // image
            Text(
                text = "Lemon Crunch Yoghurt Parfait"
            )
            Text(
                text = "$18"
            )

        }

    }
}



@Composable
@Preview
fun ScreenOnePreview(){
    StarbucksOne()
}