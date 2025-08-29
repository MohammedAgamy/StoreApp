package com.agamy.storeapp.presentation.screens.splash

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.agamy.storeapp.R
import com.agamy.storeapp.presentation.navgation.Routes
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {

    val composition by rememberLottieComposition(
        spec = LottieCompositionSpec.RawRes(R.raw.shop_cart)
    )

    LaunchedEffect(true) {
        delay(3000)
        navController.navigate(Routes.LOGIN) {
            popUpTo(Routes.SPLASH) {
                inclusive = true
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        LottieAnimation(
            alignment = Alignment.Center,
            modifier = Modifier.size(350.dp),
            composition = composition
        )
    }
}