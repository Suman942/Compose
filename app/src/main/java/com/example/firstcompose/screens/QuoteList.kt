package com.example.firstcompose.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.firstcompose.models.Quotes

@Composable
fun QuoteList(data:ArrayList<Quotes>,onClick:()->Unit) {
    LazyColumn(content = {
        items (data){
            QuotesListItem(data =it, onClick = onClick)
        }
    })
}