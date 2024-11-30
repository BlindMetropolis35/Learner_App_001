package com.myapp01.learnerapp001

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.myapp01.learnerapp001.ui.theme.LearnerApp001Theme

class BusinessCard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnerApp001Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BusinessCard(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    val image01= painterResource(R.drawable.android_logo)
    Column(modifier = modifier
        .fillMaxHeight(0.5f)
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(painter = image01,
            contentDescription = "image_android",
            modifier=modifier
                .clip(RectangleShape)
                .padding(start = 150.dp, top = 150.dp, end = 150.dp)
                .background(color = Color.Black)
        )

        Text(text = stringResource(R.string.name),
            fontSize = 30.sp,
            modifier = modifier.padding(top = 8.dp)
        )

        Text(text = stringResource(R.string.name)
        )
    }

    Column(modifier = modifier
        .fillMaxSize()
        .padding(bottom = 30.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start,
    ) {
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = modifier.fillMaxWidth()) {
            Icon(Icons.Filled.Phone, contentDescription = "Phone")
            Text(
                text = stringResource(R.string.phone),
                fontSize = 12.sp,
                modifier = modifier.padding(8.dp)
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = modifier.fillMaxWidth()) {

            Icon(Icons.Filled.Share, contentDescription = "Share")
            Text(
                text = stringResource(R.string.androiddev),
                fontSize = 16.sp,
                modifier = modifier.padding(8.dp)
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = modifier.fillMaxWidth()) {
            Icon(Icons.Filled.Email, contentDescription = "Email")
            Text(
                text = stringResource(R.string.email),
                fontSize = 16.sp,
                modifier = modifier.padding(8.dp)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview4() {
    LearnerApp001Theme {
        BusinessCard(modifier = Modifier)
    }
}