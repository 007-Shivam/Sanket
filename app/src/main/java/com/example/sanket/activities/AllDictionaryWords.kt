package com.example.sanket.activities

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
import androidx.compose.ui.Alignment
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
import com.example.sanket.data.allWords


@Composable
fun AllDictionaryWords(navController: NavHostController, letter: String) {
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
            Dic_Words(
                allWords = allWords.filterKeys { it.startsWith(letter, ignoreCase = true) }, // Filter words starting with the selected letter
                onClick = { word ->
                    showWord = word
                }
            )
        }

        Box(
            modifier = Modifier
                .padding(top = 300.dp, bottom = 60.dp, start = 30.dp, end = 30.dp)
                .size(500.dp, 750.dp)
        ) {
            if (showWord.isNotEmpty() && allWords.containsKey(showWord)) {
                Text(
                    text = showWord.uppercase(),
                    modifier = Modifier.align(Alignment.TopCenter)
                        .padding(bottom = 10.dp),
                    style = TextStyle(
                        fontSize = 25.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold,
                        color = Color(94, 48, 35),
                    ),
                )

                AsyncImage(
                    model = allWords[showWord]!!,
                    contentDescription = showWord,
                    modifier = Modifier.size(1000.dp)
                        .padding(10.dp)
                )
            }
        }
    }
}


@Composable
fun Dic_Words(allWords: Map<String, String>, onClick: (String) -> Unit) {
    Column {
        allWords.keys.sorted().forEach { key ->
            Text(
                text = key,
                modifier = Modifier
                    .padding(vertical = 5.dp, horizontal = 20.dp)
                    .clickable {
                        onClick(key)
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
fun AllDictionaryWordsPreview() {
    val navController = rememberNavController()
    val letter = "a"
    AllDictionaryWords(navController, letter)
}