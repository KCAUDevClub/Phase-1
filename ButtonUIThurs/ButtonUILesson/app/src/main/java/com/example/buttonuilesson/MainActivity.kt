package com.example.buttonuilesson

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.buttonuilesson.ui.theme.ButtonUILessonTheme
import com.example.buttonuilesson.ui.theme.Purple500
import com.example.buttonuilesson.ui.theme.Reds

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ButtonUILessonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("JetPack Compose Camp Team")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(text = "Hello $name!")
        Spacer(modifier = Modifier.padding(20.dp))
        NewButton(text = "Log in", textColor = Color.Black, gradientChosen = Brush.linearGradient(
            listOf(Purple500, Reds)))
    }
    
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ButtonUILessonTheme {
        Greeting("JetPack Compose Camp Team")
    }
}