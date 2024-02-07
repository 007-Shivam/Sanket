package com.example.sanket.activities

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.sanket.R

@Composable
fun HomePage(navController: NavHostController) {


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

            Image(painter = painterResource(id = R.drawable.sign_dictionary),
                contentDescription = null,
                modifier = Modifier.clickable { navController.navigate("SignDictionary") }
            )
            Text(text = stringResource(id = R.string.sign_dic),
                style = TextStyle(
                    fontSize = 35.sp,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(94, 48, 35),
                )
            )


            Image(painter = painterResource(id = R.drawable.signword), contentDescription = null,
                modifier = Modifier.clickable { navController.navigate("SignToWord") })
            Text(text = stringResource(id = R.string.sign_word),
                style = TextStyle(
                    fontSize = 35.sp,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(94, 48, 35),
                )
            )


            Image(painter = painterResource(id = R.drawable.wordsign), contentDescription = null,
                modifier = Modifier.clickable { navController.navigate("WordToSign") })
            Text(text = stringResource(id = R.string.word_sign),
                style = TextStyle(
                    fontSize = 35.sp,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(94, 48, 35),
                )
            )
        }

    }
}


@Preview
@Composable
fun HomePagePreview() {
    val navController = rememberNavController()
    HomePage(navController)
}