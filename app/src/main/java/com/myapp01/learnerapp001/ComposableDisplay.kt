package com.myapp01.learnerapp001

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.myapp01.learnerapp001.ui.theme.LearnerApp001Theme

class ComposableDisplay : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnerApp001Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ComposeDisplay(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeDisplay(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
        ) {
            Box(
                modifier = modifier
                    .background(color = Color(0xFFEADDFF))
                    .fillMaxHeight()
                    .fillMaxWidth(0.5f)
                    .clickable(enabled = true, onClickLabel = "Hey", onClick = { modifier.background(Color.Black) }),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = modifier
                        .padding(16.dp)
                ) {
                    Text(
                        text = stringResource(R.string.text_composable),
                        fontWeight = FontWeight.Bold,
                    )
                    Text(text = stringResource(R.string.text_disc))
                }
            }

            Box(
                modifier = modifier
                    .background(color = Color(0xFFD0BCFF))
                    .fillMaxHeight(),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = modifier
                        .padding(16.dp)
                ) {
                    Text(
                        text = stringResource(R.string.image_composable),
                        fontWeight = FontWeight.Bold,
                    )
                    Text(text = stringResource(R.string.image_disc))
                }
            }
        }

        Row(modifier=modifier.fillMaxWidth()) {
            Box(
                modifier = modifier
                    .background(color = Color(0xFFB69DF8))
                    .fillMaxHeight()
                    .fillMaxWidth(0.5f),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = modifier
                        .padding(16.dp)
                ) {
                    Text(
                        text = stringResource(R.string.row_composable),
                        fontWeight = FontWeight.Bold,
                    )
                    Text(text = stringResource(R.string.row_disc))
                }
            }

            Box(
                modifier = modifier
                    .background(color = Color(0xFFF6EDFF))
                    .fillMaxHeight(),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = modifier
                        .padding(16.dp)
                ) {
                    Text(
                        text = stringResource(R.string.column_composable),
                        fontWeight = FontWeight.Bold,
                    )
                    Text(text = stringResource(R.string.column_disc))
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview3() {
    LearnerApp001Theme {
        ComposeDisplay()
    }
}