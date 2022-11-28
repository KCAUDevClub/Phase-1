package com.example.buttonuilesson

import android.widget.Button
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.buttonuilesson.ui.theme.Purple200
import com.example.buttonuilesson.ui.theme.Purple500
import com.example.buttonuilesson.ui.theme.Reds


//@Composable
//
//fun ButtonUI (){
//    Column(
//        modifier = Modifier.
//                fillMaxSize()
//            .background(Color.White),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        // 1st
//        Text(text = "Button UI lesson")
//        // 2nd
//        Button(
//            onClick = { /*TODO*/ }
//        ) {
//            Text(
//                text = "Log in"
//            )
//
//        }
//
//
//
//
//    }
//
//
//}


// 3rd creating from scratch

@Composable
fun NewButton(
    text: String,
    textColor: Color,
    gradientChosen: Brush,

){
    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Green
        ),
        contentPadding = PaddingValues(),

        onClick = { /*TODO*/ }) {
                    Box(modifier = Modifier
                        .background(gradientChosen)
                        .padding(horizontal = 16.dp, vertical = 8.dp)


                                ){
                                    Text(text = text, color = textColor)
                                }
    }


}



@Preview
@Composable
fun PreviewButtonFunction(){
//    ButtonUI()
    NewButton(text = "Sign In", textColor = Color.Black, gradientChosen = Brush.linearGradient(
        listOf(Purple500, Reds)
    ) )
    
}