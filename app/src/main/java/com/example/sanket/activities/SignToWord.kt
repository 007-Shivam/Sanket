package com.example.sanket.activities

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.sanket.R

@Composable
fun SignToWord(navController: NavHostController) {
    var showDialog by remember { mutableStateOf(false) }

    Box(contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(id = R.drawable.bg),
            contentDescription = "background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .matchParentSize()
        )


        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxHeight()
                .padding(top = 10.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.camera),
                contentDescription = "Camera",
                modifier = Modifier
                    .clickable {   }
                    .padding(16.dp)
            )

            Text(
                text = stringResource(id = R.string.cam),
                style = TextStyle(
                    fontSize = 25.sp,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(94, 48, 35),
                    textAlign = TextAlign.Center
                ),
                modifier = Modifier.padding(top = 30.dp, bottom = 30.dp)
            )

            Button(modifier = Modifier.padding(top = 30.dp, bottom = 30.dp),
                onClick = {
                    showDialog = true
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(94, 48, 35)),
            ) {
                Text(
                    text = stringResource(id = R.string.tran),
                    fontSize = 35.sp,

                    )
            }

            if (showDialog) {
                Text(
                    text = stringResource(id = R.string.hello),
                    style = TextStyle(
                        fontSize = 45.sp,
                        fontFamily = FontFamily.Default,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(94, 48, 35),
                        textAlign = TextAlign.Center
                    ),
                    modifier = Modifier.padding(top = 30.dp, bottom = 30.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun SignToWordPreview() {
    val navController = rememberNavController()// Obtain the context from the composition
    SignToWord(navController)
}