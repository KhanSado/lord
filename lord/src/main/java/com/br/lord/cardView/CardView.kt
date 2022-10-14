package com.br.lord.cardView

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardView(
    titleColor: Color = Color.Black,
    descriptionColor: Color = Color.Black,
    modifier: Modifier = Modifier,
    title: String,
    description: String,
    image: Int
){

    Card(
        modifier = modifier
            .width(216.dp)
            .height(252.dp)
            .padding(start = 6.dp, end = 6.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = 6.dp
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = "EXAMPLE",
                modifier = modifier
                    .fillMaxHeight(.5f)
                    .fillMaxWidth(),
                alignment = Alignment.TopCenter,
                contentScale = ContentScale.Crop
            )

            Text(
                text = title,
                fontFamily = FontFamily.Serif,
                fontSize = 16.sp,
                fontWeight = FontWeight.W700,
                textAlign = TextAlign.Left,
                color = titleColor,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 23.dp, top = 24.dp)
            )

            Text(
                text = description,
                fontFamily = FontFamily.Serif,
                fontSize = 14.sp,
                fontWeight = FontWeight.W400,
                textAlign = TextAlign.Left,
                color = descriptionColor,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 23.dp, top = 8.dp)
            )
        }

    }
}