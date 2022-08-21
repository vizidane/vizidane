package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HAPPYBIRTHDAYTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HAPPYBIRTHDAYTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreedingWithText("happy birthday ","Quang")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreedingWithText(message: String, name: String) {
    Column{
        Text(text = message, fontSize = 32.sp)
        Text(text = name, fontSize = 24.sp)
        Text(text = name, fontSize = 24.sp)
        Text(text = name, fontSize = 24.sp)
    }
        
    }

@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    HAPPYBIRTHDAYTheme {
        BirthdayGreedingWithText("happy birthday ","Quang")
    }
}
