package com.example.sanket.activities

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.Text
import androidx.navigation.NavController

@Composable
fun SignUp(navController: NavController) {
    Text(text = "SignUp")
}

@Preview
@Composable
fun SignUpPreview() {
    val navController = rememberNavController()// Obtain the context from the composition
    SignUp(navController)
}