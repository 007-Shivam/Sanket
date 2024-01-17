package com.example.sanket.activities

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
import com.example.sanket.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignDictionary(navController: NavHostController) {
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
            modifier = Modifier.fillMaxHeight()
                .padding(top = 20.dp)) {

            item {
                Card(modifier = Modifier.padding(start = 10.dp, end = 10.dp, bottom = 5.dp),
                    onClick = {
                        navController.navigate("A")
                    }
                ) {
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .border(1.dp, color = Color.Black)
                        .background(color = Color(254, 246, 239))
                        .padding(5.dp)
                    ) {
                        Image(painter = painterResource(id = R.drawable.alphabet_a_icon), contentDescription = "A",
                            modifier = Modifier
                                .padding(10.dp)
                                .size(90.dp)
                                .weight(1f)
                                .wrapContentWidth(Alignment.CenterHorizontally),
                        )
                    }
                }
            }

            item {
                Card(modifier = Modifier.padding(start = 10.dp, end = 10.dp, bottom = 5.dp)) {
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .border(1.dp, color = Color.Black)
                        .background(color = Color(254, 246, 239))
                        .padding(5.dp)
                    ) {
                        Image(painter = painterResource(id = R.drawable.alphabet_b_icon), contentDescription = "A",
                            modifier = Modifier
                                .padding(10.dp)
                                .size(90.dp)
                                .weight(1f)
                                .wrapContentWidth(Alignment.CenterHorizontally),
                        )
                    }
                }
            }

            item {
                Card(modifier = Modifier.padding(start = 10.dp, end = 10.dp, bottom = 5.dp),
                    onClick = {}
                ) {
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .border(1.dp, color = Color.Black)
                        .background(color = Color(254, 246, 239))
                        .padding(5.dp)
                    ) {
                        Image(painter = painterResource(id = R.drawable.alphabet_c_icon), contentDescription = "A",
                            modifier = Modifier
                                .padding(10.dp)
                                .size(90.dp)
                                .weight(1f)
                                .wrapContentWidth(Alignment.CenterHorizontally),
                        )
                    }
                }
            }

            item {
                Card(modifier = Modifier.padding(start = 10.dp, end = 10.dp, bottom = 5.dp),
                    onClick = {}
                ) {
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .border(1.dp, color = Color.Black)
                        .background(color = Color(254, 246, 239))
                        .padding(5.dp)
                    ) {
                        Image(painter = painterResource(id = R.drawable.alphabet_d_icon), contentDescription = "A",
                            modifier = Modifier
                                .padding(10.dp)
                                .size(90.dp)
                                .weight(1f)
                                .wrapContentWidth(Alignment.CenterHorizontally),
                        )
                    }
                }
            }

            item {
                Card(modifier = Modifier.padding(start = 10.dp, end = 10.dp, bottom = 5.dp),
                    onClick = {}
                ) {
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .border(1.dp, color = Color.Black)
                        .background(color = Color(254, 246, 239))
                        .padding(5.dp)
                    ) {
                        Image(painter = painterResource(id = R.drawable.alphabet_e_icon), contentDescription = "A",
                            modifier = Modifier
                                .padding(10.dp)
                                .size(90.dp)
                                .weight(1f)
                                .wrapContentWidth(Alignment.CenterHorizontally),
                        )
                    }
                }
            }

            item {
                Card(modifier = Modifier.padding(start = 10.dp, end = 10.dp, bottom = 5.dp),
                    onClick = {}
                ) {
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .border(1.dp, color = Color.Black)
                        .background(color = Color(254, 246, 239))
                        .padding(5.dp)
                    ) {
                        Image(painter = painterResource(id = R.drawable.alphabet_f_icon), contentDescription = "A",
                            modifier = Modifier
                                .padding(10.dp)
                                .size(90.dp)
                                .weight(1f)
                                .wrapContentWidth(Alignment.CenterHorizontally),
                        )
                    }
                }
            }

            item {
                Card(modifier = Modifier.padding(start = 10.dp, end = 10.dp, bottom = 5.dp),
                    onClick = {}
                ) {
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .border(1.dp, color = Color.Black)
                        .background(color = Color(254, 246, 239))
                        .padding(5.dp)
                    ) {
                        Image(painter = painterResource(id = R.drawable.alphabet_g_icon), contentDescription = "A",
                            modifier = Modifier
                                .padding(10.dp)
                                .size(90.dp)
                                .weight(1f)
                                .wrapContentWidth(Alignment.CenterHorizontally),
                        )
                    }
                }
            }

            item {
                Card(modifier = Modifier.padding(start = 10.dp, end = 10.dp, bottom = 5.dp),
                    onClick = {}
                ) {
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .border(1.dp, color = Color.Black)
                        .background(color = Color(254, 246, 239))
                        .padding(5.dp)
                    ) {
                        Image(painter = painterResource(id = R.drawable.alphabet_h_icon), contentDescription = "A",
                            modifier = Modifier
                                .padding(10.dp)
                                .size(90.dp)
                                .weight(1f)
                                .wrapContentWidth(Alignment.CenterHorizontally),
                        )
                    }
                }
            }
        }
    }
}


@Preview
@Composable
fun SignDictionaryPreview() {
    val navController = rememberNavController()// Obtain the context from the composition
    SignDictionary(navController)
}