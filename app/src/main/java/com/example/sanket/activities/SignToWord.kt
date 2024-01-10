package com.example.sanket.activities

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.Text

@Composable
fun SignToWord(navController: NavHostController) {
    Text(text = "Word")
}

@Preview
@Composable
fun SignToWordPreview() {
    val navController = rememberNavController()// Obtain the context from the composition
    SignToWord(navController)
}