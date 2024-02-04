package com.example.sanket.dictionary

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.example.sanket.R


@Composable
fun A(navController: NavHostController) {
    val scrollState = rememberScrollState()
    var showWord by remember { mutableStateOf("") }

    Box() {
        Image(
            painter = painterResource(id = R.drawable.bg),
            contentDescription = "background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .matchParentSize()
        )

        Box(
            modifier = Modifier
                .padding(26.dp)
                .height(200.dp)
                .fillMaxSize()
                .border(
                    BorderStroke(width = 3.dp, color = Color.Black),
                    shape = RoundedCornerShape(0.dp)
                )
                .background(color = Color.Transparent)
                .verticalScroll(scrollState)
        ) {
            Dic_Words(a_words = a_words) { word ->
                showWord = word
            }
        }

        Box(
            modifier = Modifier
                .padding(top = 300.dp, bottom = 60.dp, start = 30.dp)
                .size(350.dp, 450.dp)
        ) {
            if (showWord.isNotEmpty() && a_words.containsKey(showWord)) {
                AsyncImage(
                    model = a_words[showWord]!!,
                    contentDescription = showWord,
                    modifier = Modifier.padding(50.dp).size(450.dp)
                )
            }
        }
    }
}


@Composable
fun Dic_Words(a_words: Map<String, String>, onClick: (String) -> Unit) {
    Column {
        a_words.forEach { (key, value) ->
            Text(
                text = key,
                modifier = Modifier
                    .padding(vertical = 5.dp, horizontal = 20.dp)
                    .clickable {
                        onClick(key) // Update with the key instead of value
                    },
                style = TextStyle(
                    fontSize = 25.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    color = Color(94, 48, 35),
                ),
            )
        }
    }
}




@Preview
@Composable
fun APreview() {
    val navController = rememberNavController()
    A(navController)
}