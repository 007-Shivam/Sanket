package com.example.sanket.activities

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.sanket.R

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun SignUp(context: Context = LocalContext.current, navController: NavController) {
    var name by remember { mutableStateOf(TextFieldValue()) }
    var email by remember { mutableStateOf(TextFieldValue()) }
    var phone by remember { mutableStateOf(TextFieldValue()) }
    val gender by remember { mutableStateOf(TextFieldValue()) }
    var password by remember { mutableStateOf(TextFieldValue()) }
    var confirm by remember { mutableStateOf(TextFieldValue()) }
    var selectedGender by remember{ mutableStateOf("") }
    var privacyPolicy by remember { mutableStateOf(false) }
    val keyboardController = LocalSoftwareKeyboardController.current


    Box() {
        Image(
            painter = painterResource(id = R.drawable.bg),
            contentDescription = "background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .matchParentSize()
        )
        Text(
            text = stringResource(id = R.string.signup),
            style = TextStyle(
                fontSize = 55.sp,
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.ExtraBold,
                color = Color(94, 48, 35),
            ),
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(top = 45.dp, start = 60.dp, end = 20.dp),
            textAlign = TextAlign.Start
        )

        LazyColumn(modifier = Modifier
            .align(Alignment.Center)
            .padding(top = 150.dp, start = 40.dp)
        )
        {
            item {
                TextField(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .border(
                            BorderStroke(width = 3.dp, color = Color.Black),
                            shape = RoundedCornerShape(50.dp)
                        )
                        .border(
                            width = 3.dp,
                            brush = Brush.radialGradient(listOf(Color.Black, Color.White)),
                            shape = RoundedCornerShape(50.dp)
                        ),
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Done
                    ),
                    keyboardActions = KeyboardActions(
                        onDone = {
                            keyboardController?.hide()
                        }
                    ),
                    value = name,
                    onValueChange = { name = it },
                    placeholder = { Text(text = stringResource(id = R.string.name)) },
                    colors = TextFieldDefaults.textFieldColors(
                        cursorColor = Color(94, 48, 35),
                        containerColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                    ),
                )
            }
            item {
                TextField(
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .align(Alignment.Center)
                        .border(
                            BorderStroke(width = 3.dp, color = Color.Black),
                            shape = RoundedCornerShape(50.dp)
                        )
                        .border(
                            width = 3.dp,
                            brush = Brush.radialGradient(listOf(Color.Black, Color.White)),
                            shape = RoundedCornerShape(50.dp)
                        ),
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Done
                    ),
                    keyboardActions = KeyboardActions(
                        onDone = {
                            keyboardController?.hide()
                        }
                    ),
                    value = email,
                    onValueChange = { email = it },
                    placeholder = { Text(text = stringResource(id = R.string.email)) },
                    colors = TextFieldDefaults.textFieldColors(
                        cursorColor = Color(94, 48, 35),
                        containerColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                    ),                )
            }
            item {
                TextField(
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .align(Alignment.Center)
                        .border(
                            BorderStroke(width = 3.dp, color = Color.Black),
                            shape = RoundedCornerShape(50.dp)
                        )
                        .border(
                            width = 3.dp,
                            brush = Brush.radialGradient(listOf(Color.Black, Color.White)),
                            shape = RoundedCornerShape(50.dp)
                        ),
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Done
                    ),
                    keyboardActions = KeyboardActions(
                        onDone = {
                            keyboardController?.hide()
                        }
                    ),
                    value = phone,
                    onValueChange = { phone = it },
                    placeholder = { Text(text = stringResource(id = R.string.phone)) },
                    colors = TextFieldDefaults.textFieldColors(
                        cursorColor = Color(94, 48, 35),
                        containerColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                    ),                )
            }

            item {
                Row {
                    RadioButton(
                        selected = selectedGender == "Male",
                        onClick = { selectedGender = "Male" },
                        colors = RadioButtonDefaults.colors(Color(94, 48, 35))
                    )
                    Text(text = stringResource(id = R.string.male),
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Black,
                        ),
                        modifier = Modifier.padding(top = 13.dp))

                    Spacer(modifier = Modifier.width(8.dp))

                    RadioButton(
                        selected = selectedGender == "Female",
                        onClick = { selectedGender = "Female" },
                        colors = RadioButtonDefaults.colors(Color(94, 48, 35))
                    )
                    Text(text = stringResource(id = R.string.female),
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Black,
                        ),
                        modifier = Modifier.padding(top = 13.dp))

                    Spacer(modifier = Modifier.width(6.dp))

                    RadioButton(
                        selected = selectedGender == "Other",
                        onClick = { selectedGender = "Other" },
                        colors = RadioButtonDefaults.colors(Color(94, 48, 35))
                    )
                    Text(text = stringResource(id = R.string.other),
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Black,
                        ),
                        modifier = Modifier.padding(top = 13.dp))
                }
            }


            item {
                TextField(
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .align(Alignment.Center)
                        .border(
                            BorderStroke(width = 3.dp, color = Color.Black),
                            shape = RoundedCornerShape(50.dp)
                        )
                        .border(
                            width = 3.dp,
                            brush = Brush.radialGradient(listOf(Color.Black, Color.White)),
                            shape = RoundedCornerShape(50.dp)
                        ),
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Done
                    ),
                    keyboardActions = KeyboardActions(
                        onDone = {
                            keyboardController?.hide()
                        }
                    ),
                    value = password,
                    onValueChange = { password = it },
                    placeholder = { Text(text = stringResource(id = R.string.pas)) },
                    colors = TextFieldDefaults.textFieldColors(
                        cursorColor = Color(94, 48, 35),
                        containerColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                    ),
                )
            }
            item {
                TextField(
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .align(Alignment.Center)
                        .border(
                            BorderStroke(width = 3.dp, color = Color.Black),
                            shape = RoundedCornerShape(50.dp)
                        )
                        .border(
                            width = 3.dp,
                            brush = Brush.radialGradient(listOf(Color.Black, Color.White)),
                            shape = RoundedCornerShape(50.dp)
                        ),
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Done
                    ),
                    keyboardActions = KeyboardActions(
                        onDone = {
                            keyboardController?.hide()
                        }
                    ),
                    value = confirm,
                    onValueChange = { confirm = it },
                    placeholder = { Text(text = stringResource(id = R.string.con)) },
                    colors = TextFieldDefaults.textFieldColors(
                        cursorColor = Color(94, 48, 35),
                        containerColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                    ),
                )
            }

            item {
                Row (
                    modifier = Modifier.padding(top = 10.dp)
                        ) {
                    Checkbox(
                        checked = privacyPolicy,
                        onCheckedChange = { privacyPolicy = it },
                        colors = CheckboxDefaults.colors(Color.Black)
                    )
                    Text(text = stringResource(id = R.string.privacy),
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontFamily = FontFamily.Serif,
                            color = Color.Black,
                        ),
                        modifier = Modifier.padding(top = 13.dp)
                    )
                }

            }


            item {
                Button(
                    onClick = {
                        if(name.text == ""
                                    && email.text==""
                                    && phone.text==""
                                    && gender.text==""
                                    && password.text==""
                                    && confirm.text==""
                            && privacyPolicy
                        ){
                            Toast.makeText(context,
                                "Please fill all text fields.",
                                Toast.LENGTH_LONG
                            ).show()
                        } else {
                            Toast.makeText(context,
                                "Successfully Signed Up",
                                Toast.LENGTH_LONG
                            ).show()
                            navController.navigate("LogIn")
                        } },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(94, 48, 35)),
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(top = 20.dp, start = 100.dp)
                ) {
                    Text(text = stringResource(id = R.string.signup))
                }
            }

            item {
                TextButton(
                    onClick = {
                        navController.navigate("LogIn")
                    },
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 30.dp, start = 40.dp)
                ) {
                    Text(text = stringResource(id = R.string.hv_acc),
                        color = Color(94, 48, 35),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            }


        }
    }
}

@Preview
@Composable
fun SignUpPreview() {
    val context = LocalContext.current
    val navController = rememberNavController()// Obtain the context from the composition
    SignUp(context, navController)
}