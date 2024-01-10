package com.example.sanket.activities

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun LogIn(navController: NavHostController) {
    Text(text = "Sjvsjkvksbvsbv")
}

@Preview
@Composable
fun LogInPreview() {
    val navController = rememberNavController()// Obtain the context from the composition
    LogIn(navController)
}