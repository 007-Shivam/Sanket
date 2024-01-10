package com.example.sanket

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sanket.activities.About
import com.example.sanket.activities.Contact
import com.example.sanket.activities.HamburgerMenu
import com.example.sanket.activities.HomePage
import com.example.sanket.activities.LogIn
import com.example.sanket.activities.Profile
import com.example.sanket.activities.SignDictionary
import com.example.sanket.activities.SignToWord
import com.example.sanket.activities.SignUp
import com.example.sanket.activities.Tutorial
import com.example.sanket.activities.WordToSign

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNavigation()
        }
    }
}

@Composable
fun MyNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "HomePage") {
        composable("HamburgerMenu") {
            HamburgerMenu(navController = navController)
        }
        composable("HomePage") {
            HomePage(navController = navController)
        }
        composable("SignUp") {
            SignUp(navController = navController)
        }
        composable("LogIn") {
            LogIn(navController = navController)
        }
        composable("About") {
            About(navController = navController)
        }
        composable("Contact") {
            Contact(navController = navController)
        }
        composable("Profile") {
            Profile(navController = navController)
        }
        composable("SignDictionary") {
            SignDictionary(navController = navController)
        }
        composable("Tutorial") {
            Tutorial(navController = navController)
        }
        composable("SignToWord") {
            SignToWord(navController = navController)
        }
        composable("WordToSign") {
            WordToSign(navController = navController)
        }
    }
}