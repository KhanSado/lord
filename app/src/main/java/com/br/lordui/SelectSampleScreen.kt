package com.br.lordui

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SelectSampleScreen(navController: NavController) {
    Scaffold(

    ) {
        MainContent(navController = navController)
    }
}

@Composable
fun MainContent(navController: NavController) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column() {
                Button(onClick = {
                    navController.navigate(Screens.SlideViewScreen.name)
                }) {
                    Text(text = "SlideView")
                }

                Button(onClick = {
                    navController.navigate(Screens.CardViewScreen.name)
                }) {
                    Text(text = "CardView")
                }
            }
        }
}