package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import java.time.format.TextStyle

class ArticuloComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TaskComplete("All tasks completed","Nice work!")
                }
            }
        }
    }
}

@Composable
fun TaskComplete(message1: String, message2: String) {
    val image = painterResource(R.drawable.ic_task_completed)
    Column {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = message1,
            textAlign = TextAlign.Justify,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = message2,
            textAlign = TextAlign.Justify,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    HappyBirthdayTheme {
        TaskComplete("All tasks completed","Nice work!")
    }
}