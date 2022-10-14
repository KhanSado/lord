package com.br.lordui.components.cardview

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.br.lord.cardView.CardView
import com.br.lordui.R

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CardViewScreen(navController: NavController) {
    Scaffold(

    ) {
        MainContent(navController = navController)
    }
}

@Composable
fun MainContent(navController: NavController){
    var title by remember {
        mutableStateOf("Title card")
    }
    var description by remember {
        mutableStateOf("this is a very beautiful descirption to this card")
    }

    CardView(
        image = R.drawable.piplup,
        title = title,
        description = description,
        titleColor = Color.Black,
        descriptionColor = Color.Gray
    )
}