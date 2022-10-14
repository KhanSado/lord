package com.br.lordui

enum class Screens {
    SelectSampleScreen,
    SlideViewScreen,
    CardViewScreen;

    companion object {
        fun fromRoute(route: String?): Screens =
            when (
                route?.substringBefore(delimiter = "/")
            ) {
                SlideViewScreen.name -> SlideViewScreen
                CardViewScreen.name -> CardViewScreen
                SelectSampleScreen.name -> SelectSampleScreen
                null -> SelectSampleScreen
                else -> throw IllegalArgumentException()
            }
    }
}