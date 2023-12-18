package com.example.firstcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.firstcompose.models.Quotes

@Composable
fun QuoteDetail(data:Quotes) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color(0xFFffffff),
                        Color(0xFFE3E3E3)
                    )
                )
            )
    ) {
        Card(
            elevation = CardDefaults.elevatedCardElevation(4.dp), colors = CardDefaults.cardColors(
                Color.White
            ),
            modifier = Modifier.padding(32.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(16.dp,24.dp)

            ) {

                Image(
                    imageVector = Icons.Filled.ThumbUp,
                    colorFilter = ColorFilter.tint(Color.White),
                    contentDescription = "Quotes",
                    alignment = Alignment.TopStart, modifier = Modifier
                        .size(80.dp)
                        .background(Color.Black)

                )

                Text(
                    text = data.title,
                    style = MaterialTheme.typography.titleSmall,
                    modifier = Modifier.padding(0.dp,16.dp)
                )

                Text(
                    text = data.author,
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Normal)
            }
        }
    }
}