package com.br.lord.slideview

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun SliderView(
    state: PagerState = rememberPagerState(),
    items: Array<DataSlide>,
    modifier: Modifier = Modifier,
    bgColor: Color = Color.Blue,
    colorTitle: Color = Color.White,
    fontFamilyTitle: FontFamily = FontFamily.Default,
    colorDescription: Color = Color.White,
    fontFamilyDescription: FontFamily = FontFamily.Cursive,
    imgDescription: Int = 0
) {
    HorizontalPager(
        modifier = modifier
            .background(bgColor)
            .fillMaxHeight()
            .fillMaxWidth(),
        state = state,
        count = items.size,
    ) { page ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = items[page].img),
                contentDescription = null,
                Modifier
                    .padding(start = 38.dp,end = 38.dp)
                    .fillMaxWidth()
                    .height(296.dp)


            )
            Text(
                text = items[page].title,
                color = colorTitle,
                fontFamily = fontFamilyTitle,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(top = 27.dp, end = 14.5f.dp, start = 14.5f.dp, bottom = 12.dp)
                    .width(291.dp)
            )
            Text(
                text = items[page].description,
                color = colorDescription,
                fontFamily = fontFamilyDescription,
                fontWeight = FontWeight.W400,
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(end = 12.5f.dp, start = 12.5f.dp, bottom = 116.dp)
                    .width(295.dp)
            )

            Column(
                modifier = Modifier
                    .padding(start = 30.dp)
            ) {
                DotsIndicator(
                    totalDots = items.size,
                    selectedIndex = state.currentPage
                )
            }

        }
    }
}