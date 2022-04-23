package com.kartikeya.weatherforcast.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kartikeya.weatherforcast.screens.MainScreen
import com.kartikeya.weatherforcast.screens.WeatherSplashScreen

@Composable
fun WeatherNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = WeatherScreens.SplashScreen.name
    ) {
        composable(WeatherScreens.SplashScreen.name){
            WeatherSplashScreen(navController= navController)
        }
        composable(WeatherScreens.MainScreen.name){
            MainScreen(navController = navController)
        }
    }
}