package com.example.sanket.activities

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
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
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.sanket.R

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun WordToSign(context: Context = LocalContext.current, navController: NavHostController) {
    var wts by remember { mutableStateOf(TextFieldValue()) }
    var showImg by remember { mutableStateOf(false) }
    val keyboardController = LocalSoftwareKeyboardController.current


    Box(contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(id = R.drawable.bg),
            contentDescription = "background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .matchParentSize()
        )


        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxHeight()
                .padding(top = 100.dp)
        ) {
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
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Done
                ),
                keyboardActions = KeyboardActions(
                    onDone = {
                        // Do something when the "Done" action is triggered
                        keyboardController?.hide()
                    }
                ),
                value = wts,
                onValueChange = { wts = it },
                placeholder = { Text(text = stringResource(id = R.string.word)) },
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
                    if(wts.text == ""){
                        Toast.makeText(context,
                            "Invalid credentials."
                                    + "Please try again.",
                            Toast.LENGTH_LONG
                        ).show()
                    } else {
                        showImg = true

                    }
                    keyboardController?.hide()
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(94, 48, 35)),
                modifier = Modifier
                    .padding(top = 20.dp)
            ) {
                Text(text = stringResource(id = R.string.search))
            }

            if (showImg) {
                Image(
                    painter = painterResource(id = R.drawable.hello),
                    contentDescription = "hello",
                    modifier = Modifier.padding(50.dp)
                        .size(450.dp)
                )
            }

        }
    }

}

@Preview
@Composable
fun WordToSignPreview() {
    val context = LocalContext.current
    val navController = rememberNavController()// Obtain the context from the composition
    WordToSign(context, navController)
}