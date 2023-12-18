package com.example.firstcompose.screens

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.ThumbUp

import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun QuotesListItem() {
    Card(
        elevation = CardDefaults.cardElevation(4.dp), modifier = Modifier
            .padding(24.dp), colors = CardDefaults.cardColors(Color.White)
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Image(
                imageVector = Icons.Filled.ThumbUp,
                colorFilter = ColorFilter.tint(Color.White),
                contentDescription = "Quotes",
                alignment = Alignment.TopStart, modifier = Modifier
                    .size(40.dp)
                    .background(Color.Black)

            )
            Spacer(modifier = Modifier.padding(8.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "Time is the most valuable thing a man can spend",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp),
                    fontSize = 16.sp
                )

                Box(
                    modifier = Modifier
                        .background(Color.LightGray)
                        .fillMaxWidth(.5f)
                        .height(1.dp)
                )

                Text(
                    text = "Suman Shil",
                    style = MaterialTheme.typography.bodySmall,
                    fontWeight = FontWeight.Thin,
                    modifier = Modifier.padding(top = 4.dp),
                    fontSize = 14.sp
                )

            }
        }
    }

}

@Composable
fun QuoteDetail() {
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
                    text = "Time is the most valuable thing a man can spend",
                    style = MaterialTheme.typography.titleSmall,
                    modifier = Modifier.padding(0.dp,16.dp)
                )

                Text(
                    text = "Suman Shil",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Normal)
            }
        }
    }
}