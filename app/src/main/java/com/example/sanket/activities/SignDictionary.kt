package com.example.sanket.activities

import Alphabets
import alp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.example.sanket.R


@Composable
fun SignDictionary(navController: NavHostController) {
    val alphabetOnClickActions = listOf(
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
        { navController.navigate("A") },
    )


    Box() {
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
                .padding(top = 20.dp)
        ) {
            itemsIndexed(alp) { index, alph ->
                AlphabetMenu(alph, onClick =  alphabetOnClickActions[index])
            }

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AlphabetMenu(alph: Alphabets, onClick: () -> Unit) {
    Card(modifier = Modifier.padding(start = 10.dp, end = 10.dp, bottom = 5.dp),
        onClick = onClick
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .border(1.dp, color = Color.Black)
            .background(color = Color(254, 246, 239))
            .padding(5.dp)
        ) {
            AsyncImage(
                model = alph.image,
                contentDescription = "Alphabet",
                modifier = Modifier
                    .padding(10.dp)
                    .size(90.dp)
                    .weight(1f)
                    .wrapContentWidth(Alignment.CenterHorizontally),
            )
        }
    }
}

@Preview
@Composable
fun SignDictionaryPreview() {
    val navController = rememberNavController()
    SignDictionary(navController)
}