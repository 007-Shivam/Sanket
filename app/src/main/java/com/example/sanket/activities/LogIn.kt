package com.example.sanket.activities

import android.content.Context
import android.net.wifi.hotspot2.pps.HomeSp
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.sanket.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LogIn(context: Context = LocalContext.current, navController: NavHostController) {
    var email by remember { mutableStateOf(TextFieldValue()) }
    var password by remember { mutableStateOf(TextFieldValue()) }

    Box() {
        Image(painter = painterResource(id = R.drawable.bg),
            contentDescription = "background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .matchParentSize()
        )

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {

            Image(
                painter = painterResource(id = R.drawable.sign_logo),
                contentDescription = "logo",
                modifier = Modifier
                    .padding(top = 50.dp, bottom = 20.dp, start = 20.dp)
                    .fillMaxWidth()
                    .wrapContentWidth(align = Alignment.Start),
            )

            Text(text = stringResource(id = R.string.proceed),
                style = TextStyle(
                    fontSize = 35.sp,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(94, 48, 35),
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(align = Alignment.Start)
                    .padding(start = 40.dp),
            )

            Text(text = stringResource(id = R.string.login),
                style = TextStyle(
                    fontSize = 55.sp,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(94, 48, 35),
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(align = Alignment.Start)
                    .padding(start = 40.dp, bottom = 50.dp),
            )

            TextField(
                modifier = Modifier
                    .border(
                        BorderStroke(width = 3.dp, color = Color.Black),
                        shape = RoundedCornerShape(50.dp)
                    )
                    .border(
                        width = 3.dp,
                        brush = Brush.radialGradient(listOf(Color.Black, Color.White)),
                        shape = RoundedCornerShape(50.dp)
                    )
                    .padding(top = 10.dp),
                value = email,
                onValueChange = { email = it },
                placeholder = { Text(text = stringResource(id = R.string.email)) },
                colors = TextFieldDefaults.textFieldColors(
                    cursorColor = Color(94, 48, 35),
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                singleLine = true,
                )


            TextField(
                modifier = Modifier
                    .padding(top = 30.dp)
                    .border(
                        BorderStroke(width = 3.dp, color = Color.Black),
                        shape = RoundedCornerShape(50.dp)
                    )
                    .border(
                        width = 3.dp,
                        brush = Brush.radialGradient(listOf(Color.Black, Color.White)),
                        shape = RoundedCornerShape(50.dp)
                    ),
                value = password,
                onValueChange = { password = it },
                visualTransformation = PasswordVisualTransformation(),
                placeholder = { Text(text = stringResource(id = R.string.pas)) },
                colors = TextFieldDefaults.textFieldColors(
                    cursorColor = Color(94, 48, 35),
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                singleLine = true,

                )

            Button(
                onClick = {
                    if(email.text == ""
                        && password.text==""
                    ){
                        Toast.makeText(context,
                            "Welcome to Saket!",
                            Toast.LENGTH_LONG
                        ).show()
                        navController.navigate("HomePage")
                    } else {
                        Toast.makeText(context,
                            "Invalid credentials."
                                    + "Please try again.",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(94, 48, 35)),
                modifier = Modifier
                    .padding(top = 20.dp)
            ) {
                Text(text = stringResource(id = R.string.login))
            }

            TextButton(
                onClick = {
                    navController.navigate("SignUp")
                },
            ) {
                Text(text = stringResource(id = R.string.no_acc),
                    color = Color(94, 48, 35)
                )
            }
        }
    }
}

@Preview
@Composable
fun LogInPreview() {
    val context = LocalContext.current
    val navController = rememberNavController()// Obtain the context from the composition
    LogIn(context, navController)
}
