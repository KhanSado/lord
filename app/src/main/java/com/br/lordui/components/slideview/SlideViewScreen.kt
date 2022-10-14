package com.br.lordui.components.slideview

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.navigation.NavController
import com.br.lord.slideview.DataSlide
import com.br.lord.slideview.SliderView
import com.br.lordui.R
import com.google.accompanist.pager.ExperimentalPagerApi

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SlideViewScreen(navController: NavController) {
    Scaffold(

    ) {
        MainContent(navController = navController)
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun MainContent(navController: NavController) {
                val data = arrayOf(
                        DataSlide("Title slide one", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur id.", img = R.drawable.piplup),
                        DataSlide("title slide two", "Sed id velit non sapien laoreet sodales. Curabitur aliquet sem nunc, fringilla ultrices lacus iaculis id.", img = R.drawable.chamander),
                        DataSlide("title slidde three", "Maecenas porttitor a metus sit amet venenatis.", img = R.drawable.sprigatito),
                )
                //Partial Usage
                /*
                    SliderView(
                       items = data,
                    )
                 */

                //FULL USAGE
                SliderView(
                    items = data,
                    bgColor = Color.Gray, //Definindo cor do fundo das telas
                    colorTitle = Color.Cyan, // Definindo cor do titulo
                    colorDescription = Color.Green, // Deinindo cor da descrição
                    fontFamilyTitle = FontFamily.Monospace, //Definindo Font family do titulo
                    fontFamilyDescription = FontFamily.Serif // Definindo Font family da descriçõa
                )

}