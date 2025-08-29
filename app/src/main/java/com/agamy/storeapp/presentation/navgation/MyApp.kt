package com.agamy.storeapp.presentation.navgation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.agamy.storeapp.presentation.screens.auth.login.LogInScreen
import com.agamy.storeapp.presentation.screens.auth.signup.SignUpScreen
import com.agamy.storeapp.presentation.screens.home.HomeScreen
import com.agamy.storeapp.presentation.screens.splash.SplashScreen

@Composable
fun MyApp() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.SPLASH
    ) {

        composable(Routes.SPLASH) { SplashScreen(navController) }
        composable(Routes.HOME) { HomeScreen() }
        composable(Routes.LOGIN){  LogInScreen() }
        composable(Routes.SIGNUP){ SignUpScreen() }

    }
}