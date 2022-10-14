package com.br.lordui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.br.lordui.components.cardview.CardViewScreen
import com.br.lordui.components.slideview.SlideViewScreen

@Composable
fun Nav(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screens.SelectSampleScreen.name
    ) {
        composable(route = Screens.SelectSampleScreen.name) {
            SelectSampleScreen(navController = navController)
        }

        composable(route = Screens.SlideViewScreen.name) {
            SlideViewScreen(navController = navController)
        }

        composable(route = Screens.CardViewScreen.name) {
            CardViewScreen(navController = navController)
        }
    }
}