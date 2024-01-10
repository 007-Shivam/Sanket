package com.example.sanket.activities

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.Text

@Composable
fun WordToSign(navController: NavHostController) {
    Text(text = "Sjvsjkvksbvsbv")
}

@Preview
@Composable
fun WordToSignPreview() {
    val navController = rememberNavController()// Obtain the context from the composition
    WordToSign(navController)
}