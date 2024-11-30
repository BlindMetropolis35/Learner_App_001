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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Email
import androidx.compose.material.icons.twotone.Phone
import androidx.compose.material.icons.twotone.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
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
    val image01 = painterResource(R.drawable.android_logo)
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = modifier.fillMaxHeight(0.5f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = image01,
                contentDescription = "image_android",
                modifier = modifier
                    .clip(CircleShape)
                    .size(100.dp)
                    .background(color = Color.Black)
            )

            Spacer(modifier = modifier.padding(4.dp))

            Text(
                text = stringResource(R.string.name),
                fontWeight = FontWeight.ExtraBold,
                fontSize = 30.sp
            )

            Spacer(modifier = modifier.padding(4.dp))

            Text(
                text = stringResource(R.string.title), fontWeight = FontWeight.Bold
            )
        }


        Column(
            modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(bottom = 50.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    Icons.TwoTone.Phone, contentDescription = "Phone", tint = Color.Blue
                )
                Text(
                    text = stringResource(R.string.phone),
                    fontSize = 12.sp,
                    modifier = modifier.padding(8.dp)
                )
            }

            Spacer(modifier = modifier.padding(4.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {

                Icon(
                    Icons.TwoTone.Share, contentDescription = "Share", tint = Color.Magenta
                )
                Text(
                    text = stringResource(R.string.androiddev),
                    fontSize = 12.sp,
                    modifier = modifier.padding(8.dp)
                )
            }

            Spacer(modifier = modifier.padding(4.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    Icons.TwoTone.Email, contentDescription = "Email", tint = Color.DarkGray
                )
                Text(
                    text = stringResource(R.string.email),
                    fontSize = 12.sp,
                    modifier = modifier.padding(8.dp)
                )
            }
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