package com.agamy.storeapp.presentation.screens.auth.login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
    ) {
        Spacer(modifier = Modifier.size(120.dp))

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

        Spacer(modifier = Modifier.size(50.dp))

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

        Spacer(modifier = Modifier.size(30.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            placeholder = { Text("example@gmail.com") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 22.dp)

        )

        Spacer(modifier = Modifier.size(5.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 22.dp),
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription = null) },
            trailingIcon = {
                Icon(
                    (painterResource(R.drawable.baseline_visibility_24)),
                    contentDescription = null
                )
            }
        )


        Text(
            "Forget Password ?",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp)
                .padding(start = 257.dp),
            color = Color(0xFF6C6C6C),
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.size(22.dp))

        Button(
            onClick = { /* Handle login action */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(horizontal = 22.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color(0xFFFFC107)
            )
        ) {
            Text(text = "Log In")
        }
        Spacer(modifier = Modifier.size(10.dp))

        Text(
            "ـــــ Or LogIn With ـــــ",
            modifier = Modifier.padding(10.dp),
            color = Color(0xFF6C6C6C),
        )
        Spacer(modifier = Modifier.size(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 22.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally)
        ) {

            // Google Button
            Button(
                onClick = { /* Handle Google Login */ },
                modifier = Modifier
                    .weight(1f)
                    .height(50.dp),
                border = BorderStroke(1.dp, Color(0xFF706F6F)), // حدود زرقاء
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                )
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = "Google",
                    tint = Color.Unspecified, // يخلي اللوجو بألوانه الأصلية
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.size(8.dp))
                Text(text = "Google")
            }

            // Facebook Button
            Button(
                onClick = { /* Handle Facebook Login */ },
                modifier = Modifier
                    .weight(1f)
                    .height(50.dp),
                border = BorderStroke(1.dp, Color(0xFF706F6F)), // حدود زرقاء
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFFFFFF), // أزرق Facebook
                    contentColor = Color.Black
                )
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ff),
                    contentDescription = "Facebook",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.size(8.dp))
                Text(text = "Facebook")
            }
        }


        Spacer(modifier = Modifier.size(30.dp))

        Text(
            "Don't have an account ? Sign Up",
            modifier = Modifier.padding(20.dp),
            color = Color(0xFF6C6C6C),
            fontWeight = FontWeight.Bold,
        )

    }

}


