package com.example.sanket.activities

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun Contact(navController: NavHostController) {

    Box() {
        Image(
            painter = painterResource(id = R.drawable.bg),
            contentDescription = "background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .matchParentSize()
        )

        LazyColumn() {
            item {
                Text(
                    text = stringResource(id = R.string.contact),
                    style = TextStyle(
                        fontSize = 40.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold,
                        color = Color(94, 48, 35),
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    textAlign = TextAlign.Center
                )
            }

            item {
                Text(
                    text = stringResource(id = R.string.content),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Normal,
                        color = Color(94, 48, 35),
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp, 30.dp),
                    textAlign = TextAlign.Center
                )
            }

            item {
                Text(
                    text = stringResource(id = R.string.customer),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Normal,
                        color = Color(94, 48, 35),
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp, top = 20.dp),
                    textAlign = TextAlign.Center
                )
            }

            item {
                Text(
                    text = stringResource(id = R.string.cust_email),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold,
                        color = Color(94, 48, 35),
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp, top = 10.dp),
                    textAlign = TextAlign.Center
                )
            }

            item {
                Text(
                    text = stringResource(id = R.string.tech),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Normal,
                        color = Color(94, 48, 35),
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp, top = 30.dp),
                    textAlign = TextAlign.Center
                )
            }

            item {
                Text(
                    text = stringResource(id = R.string.tech_email),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold,
                        color = Color(94, 48, 35),
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp, top = 10.dp),
                    textAlign = TextAlign.Center
                )
            }

            item {
                Text(
                    text = stringResource(id = R.string.business),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Normal,
                        color = Color(94, 48, 35),
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp, top = 30.dp),
                    textAlign = TextAlign.Center
                )
            }

            item {
                Text(
                    text = stringResource(id = R.string.business_email),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold,
                        color = Color(94, 48, 35),
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp, top = 10.dp),
                    textAlign = TextAlign.Center
                )
            }

            item {
                Text(
                    text = stringResource(id = R.string.social_media),
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold,
                        color = Color(94, 48, 35),
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp, top = 30.dp),
                    textAlign = TextAlign.Center
                )
            }



            item {
                Row(modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp, top = 10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.instagram1),
                        contentDescription = "logo",
                        modifier = Modifier
                            .padding(top = 20.dp, bottom = 0.dp, start = 50.dp)
                            .size(width = 26.dp, height = 26.dp)
                            .fillMaxWidth()
                            .wrapContentWidth(align = Alignment.Start),
                    )
                    Image(
                        painter = painterResource(id = R.drawable.linkedin1),
                        contentDescription = "logo",
                        modifier = Modifier
                            .padding(top = 20.dp, bottom = 0.dp, start = 55.dp)
                            .size(width = 26.dp, height = 26.dp)
                            .fillMaxWidth()
                            .wrapContentWidth(align = Alignment.Start),
                    )
                    Image(
                        painter = painterResource(id = R.drawable.twitter),
                        contentDescription = "logo",
                        modifier = Modifier
                            .padding(top = 20.dp, bottom = 0.dp, start = 60.dp)
                            .size(width = 26.dp, height = 26.dp)
                            .fillMaxWidth()
                            .wrapContentWidth(align = Alignment.Start),
                    )
                    Image(
                        painter = painterResource(id = R.drawable.whatsapp),
                        contentDescription = "logo",
                        modifier = Modifier
                            .padding(top = 20.dp, bottom = 0.dp, start = 65.dp)
                            .size(width = 26.dp, height = 26.dp)
                            .fillMaxWidth()
                            .wrapContentWidth(align = Alignment.Start),
                    )
                }

            }
//            item {
//                Image(
//                    painter = painterResource(id = R.drawable.linkedin1),
//                    contentDescription = "logo",
//                    modifier = Modifier
//                        .padding(top = 0.dp, bottom = 0.dp, start = 140.dp)
//                        .size(width = 26.dp, height = 26.dp)
//                        .fillMaxWidth()
//                        .wrapContentWidth(align = Alignment.Start),
//                )
//            }
//            item {
//
//            }
//            item {
//
//            }

        }
    }
}

@Preview
@Composable
fun ContactPreview() {
    val navController = rememberNavController()// Obtain the context from the composition
    Contact(navController)
}