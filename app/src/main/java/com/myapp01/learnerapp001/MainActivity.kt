package com.myapp01.learnerapp001

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.myapp01.learnerapp001.ui.theme.LearnerApp001Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnerApp001Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LearnerAppMain(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun LearnerAppMain(modifier: Modifier = Modifier) {
    val bg_image = painterResource(R.drawable.bg_compose_background)

    Column {
        Image(
            painter = bg_image,
            contentDescription = "bg_learner", modifier = modifier.fillMaxWidth()
        )

        Text(
            text = stringResource(R.string.header),
            fontSize = 24.sp,
            modifier = modifier
                .padding(16.dp)
                .align(Alignment.Start)
        )

        Text(
            text = stringResource(R.string.first_pg),
            modifier = modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )

        Text(text = stringResource(R.string.second_pg),
            modifier=modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LearnerApp001Theme {
        LearnerAppMain(modifier = Modifier.padding())
    }
}