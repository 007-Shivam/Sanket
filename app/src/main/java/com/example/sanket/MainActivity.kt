package com.example.sanket

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sanket.activities.About
import com.example.sanket.activities.AppLayout
import com.example.sanket.activities.Contact
import com.example.sanket.activities.HomePage
import com.example.sanket.activities.LogIn
import com.example.sanket.activities.Profile
import com.example.sanket.activities.SignDictionary
import com.example.sanket.activities.SignToWord
import com.example.sanket.activities.SignUp
import com.example.sanket.activities.Tutorial
import com.example.sanket.activities.WordToSign
import com.example.sanket.dictionary.A

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
    NavHost(navController = navController, startDestination = "SignDictionary") {
        composable("HomePage") {
            AppLayout(navController = navController) { currentNavController ->
                HomePage(navController = currentNavController)
            }
        }
        composable("SignUp") {
            SignUp(navController = navController)
        }
        composable("LogIn") {
            LogIn(navController = navController)
        }
        composable("About") {
            AppLayout(navController = navController) { currentNavController ->
                About(navController = currentNavController)
            }
        }
        composable("Contact") {
            AppLayout(navController = navController) { currentNavController ->
                Contact(navController = currentNavController)
            }
        }
        composable("Profile") {
            AppLayout(navController = navController) { currentNavController ->
                Profile(navController = currentNavController)
            }
        }
        composable("SignDictionary") {
            AppLayout(navController = navController) { currentNavController ->
                SignDictionary(navController = currentNavController)
            }
        }
        composable("Tutorial") {
            AppLayout(navController = navController) { currentNavController ->
                Tutorial(navController = currentNavController)
            }
        }
        composable("SignToWord") {
            AppLayout(navController = navController) { currentNavController ->
                SignToWord(navController = currentNavController)
            }
        }
        composable("WordToSign") {
            AppLayout(navController = navController) { currentNavController ->
                WordToSign(navController = currentNavController)
            }
        }
        composable("A") {
            AppLayout(navController = navController) { currentNavController ->
                A(navController = currentNavController)
            }
        }
    }
}