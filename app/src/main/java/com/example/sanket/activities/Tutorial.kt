package com.example.sanket.activities

import android.content.Intent
import android.net.Uri
import androidx.activity.ComponentActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.sanket.R

private fun openGoogleLink(context: ComponentActivity) {
    val googleUri = Uri.parse("https://youtube.com/playlist?list=PLMN7QCuj6dfYD8DfG1rN6rEo1b1RyvgKF&si=pAExlv7xtcS4vR7L")
    val intent = Intent(Intent.ACTION_VIEW, googleUri)
    context.startActivity(intent)
}

@Composable
fun Tutorial(navController: NavHostController) {
    val context = LocalContext.current


    Box(contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(id = R.drawable.bg),
            contentDescription = "background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .matchParentSize()
        )

        LazyColumn(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxHeight()
                .padding(top = 80.dp, start = 30.dp, end = 30.dp)
                .fillMaxWidth()
        ) {

            item {
                Card(
                    modifier = Modifier
                        .background(color = Color(254, 246, 239))
                        .border(
                            BorderStroke(width = 3.dp, color = Color.Black),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .clickable {
                            openGoogleLink(context as ComponentActivity)
                        }
                        .padding(24.dp),
                    shape = RoundedCornerShape(10.dp),

                    ) {
                    Text(
                        text = "Begineer Level Tutorial",
                        style = MaterialTheme.typography.headlineLarge,
                        color = Color.Black,
                        modifier = Modifier
                            .background(color = Color(254, 246, 239)),
                        textAlign = TextAlign.Center

                    )
                }
            }

            item {
                Spacer(modifier = Modifier.padding(0.dp, 30.dp))
            }

            item {
                Card(
                    modifier = Modifier
                        .background(color = Color(254, 246, 239))
                        .border(
                            BorderStroke(width = 3.dp, color = Color.Black),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .clickable {
                            openGoogleLink(context as ComponentActivity)
                        }
                        .padding(24.dp),
                    shape = RoundedCornerShape(10.dp),
                ) {
                    Text(
                        text = "Intermediate Level Tutorial",
                        style = MaterialTheme.typography.headlineLarge,
                        color = Color(0, 0, 0, 255),
                        modifier = Modifier
                            .background(color = Color(254, 246, 239)),
                        textAlign = TextAlign.Center
                    )
                }
            }

            item {
                Spacer(modifier = Modifier.padding(0.dp, 30.dp))
            }

            item {
                Card(
                    modifier = Modifier
                        .background(color = Color(254, 246, 239))
                        .border(
                            BorderStroke(width = 3.dp, color = Color.Black),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .clickable {
                            openGoogleLink(context as ComponentActivity)
                        }
                        .padding(24.dp),
                    shape = RoundedCornerShape(10.dp),
                ) {
                    Text(
                        text = "Advance Level Tutorial",
                        style = MaterialTheme.typography.headlineLarge,
                        color = Color(0, 0, 0, 255),
                        modifier = Modifier
                            .background(color = Color(254, 246, 239)),
                        textAlign = TextAlign.Center
                    )
                }
            }

        }

    }
}
@Preview
@Composable
fun TutorialPreview() {
    val navController = rememberNavController()// Obtain the context from the composition
    Tutorial(navController)
}