package com.example.sanket.activities

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.Text
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sanket.R

@Composable
fun Profile(navController: NavHostController) {
    Box() {
        Image(painter = painterResource(id = R.drawable.bg),
            contentDescription = "background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .matchParentSize()
        )

        Icon(imageVector = Icons.Default.AccountCircle,
            contentDescription = "",
            modifier = Modifier
                .padding(top = 100.dp)
                .size(width = 140.dp, height = 140.dp)
                .align(Alignment.TopCenter)
        )

        Text(text = stringResource(id = R.string.p_name),
            style = TextStyle(
                fontSize = 40.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                color = Color(94, 48, 35),
            ),
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopCenter)
                .padding(top = 240.dp),
            textAlign = TextAlign.Center
        )

        Row(modifier = Modifier.padding(start = 25.dp, end = 15.dp, top = 380.dp)) {
            Column() {
                Row {
                    Text(text = stringResource(id = R.string.email),
                        style = TextStyle(
                            fontSize = 25.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                            color = Color(94, 48, 35),
                        ),
                        modifier = Modifier.fillMaxWidth(.4f)
                    )
                    Divider(color = Color(94, 48, 35),
                        modifier = Modifier
                            .height(32.dp)
                            .width(2.dp)
                    )
                    Text(text = stringResource(id = R.string.p_email),
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                            color = Color(94, 48, 35),
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 4.dp),
                        textAlign = TextAlign.Center
                    )
                }

                Row(modifier = Modifier.padding(top = 20.dp)) {
                    Text(text = stringResource(id = R.string.phone),
                        style = TextStyle(
                            fontSize = 25.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                            color = Color(94, 48, 35),
                        ),
                        modifier = Modifier.fillMaxWidth(.4f)
                    )
                    Divider(color = Color(94, 48, 35),
                        modifier = Modifier
                            .height(62.dp)
                            .width(2.dp)
                    )
                    Text(text = stringResource(id = R.string.p_ph),
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                            color = Color(94, 48, 35),
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 14.dp),
                        textAlign = TextAlign.Center
                    )
                }

                Row(modifier = Modifier.padding(top = 20.dp)) {
                    Text(text = stringResource(id = R.string.gen),
                        style = TextStyle(
                            fontSize = 25.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                            color = Color(94, 48, 35),
                        ),
                        modifier = Modifier.fillMaxWidth(.4f)
                    )
                    Divider(color = Color(94, 48, 35),
                        modifier = Modifier
                            .height(32.dp)
                            .width(2.dp)
                    )
                    Text(text = stringResource(id = R.string.p_gen),
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                            color = Color(94, 48, 35),
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 4.dp),
                        textAlign = TextAlign.Center
                    )
                }

            }
        }
    }
}

@Preview
@Composable
fun ProfilePreview() {
    val navController = rememberNavController()
    Profile(navController)
}