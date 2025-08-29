package com.agamy.storeapp.presentation.screens.auth.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.agamy.storeapp.R

@Composable
fun LogInScreen() {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    val myFont = FontFamily(
        Font(R.font.permanentmarkerregular)  // ملف الخط اللي ضفته في res/font
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.cart), // الصورة من res/drawable
                contentDescription = "My Image", modifier = Modifier.size(60.dp)
            )
            Spacer(modifier = Modifier.size(20.dp))
            Text(
                "Store App", fontSize = 27.sp, fontWeight = FontWeight.Bold, fontFamily = myFont,
                modifier = Modifier.padding(top = 10.dp)
            )
        }

        Spacer(modifier = Modifier.size(20.dp))

        Text(
            text = "Welcome Back",
            style = TextStyle(
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(modifier = Modifier.size(5.dp))

        Text(
            text = "Please LogIn to your account",
            style = TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight.Light,
            ),
            color = Color(0xFF888888)
        )

        Spacer(modifier = Modifier.size(15.dp))

        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            label = { Text("Email") },
            placeholder = { Text("example@gmail.com") },
            modifier = Modifier
                .fillMaxWidth().padding(horizontal = 22.dp)

        )

        Spacer(modifier = Modifier.size(5.dp))
        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            label = { Text("Password") },
            modifier = Modifier
                .fillMaxWidth().padding(horizontal = 22.dp),
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription = null) },
            trailingIcon = {
                Icon(
                    (painterResource(R.drawable.baseline_visibility_24)),
                    contentDescription = null
                )
            }
        )

    }

}