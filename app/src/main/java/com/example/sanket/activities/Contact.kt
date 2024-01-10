package com.example.sanket.activities

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.Text

@Composable
fun Contact(navController: NavHostController) {
    Text(text = "Sjvsjkvksbvsbv")
}

@Preview
@Composable
fun ContactPreview() {
    val navController = rememberNavController()// Obtain the context from the composition
    Contact(navController)
}