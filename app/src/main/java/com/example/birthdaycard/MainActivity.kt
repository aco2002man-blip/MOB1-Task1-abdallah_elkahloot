package com.example.birthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.isSystemInDarkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardApp()
        }
    }
}

@Composable
fun BirthdayCardApp() {
    val darkMode = isSystemInDarkTheme()

    val backgroundColor = if (darkMode) {
        Color(0xFF191326)
    } else {
        Color(0xFFFFF0F5)
    }

    val textColor = if (darkMode) {
        Color(0xFFFFD6E7)
    } else {
        Color(0xFF8E2457)
    }

    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = backgroundColor
        ) {
            BirthdayCard(
                textColor = textColor
            )
        }
    }
}

@Composable
fun BirthdayCard(textColor: Color) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "🎈 🎉 🎈",
                fontSize = 36.sp
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Happy Birthday!",
                fontSize = 34.sp,
                fontWeight = FontWeight.Bold,
                color = textColor,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Wishing you a day full of joy!",
                fontSize = 18.sp,
                color = textColor,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "🎂",
                fontSize = 80.sp
            )

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "From your friend ❤️",
                fontSize = 18.sp,
                color = textColor,
                textAlign = TextAlign.Center
            )
        }
    }
}