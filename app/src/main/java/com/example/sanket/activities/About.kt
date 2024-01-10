package com.example.sanket.activities

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun About(navController: NavHostController) {
    Text(text = "About")
}

@Preview
@Composable
fun AboutPreview() {
    val navController = rememberNavController()// Obtain the context from the composition
    About(navController)
}