package com.example.firstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.firstcompose.dataSource.DataManager
import com.example.firstcompose.dataSource.Pages
import com.example.firstcompose.models.Quotes
import com.example.firstcompose.screens.QuoteDetail
import com.example.firstcompose.screens.QuoteListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataManager.loadData()
        setContent {
            Home(DataManager.dataList)
        }
    }
}

@Composable
fun Home(dataList: ArrayList<Quotes>) {
    if (DataManager.currentPage.value == Pages.LISTING) {
        if (DataManager.isDataLoaded.value) {
            QuoteListScreen(data = dataList) {
                DataManager.switchPage(it)
            }
        }
    } else {
        DataManager.currentQuote?.let { QuoteDetail(data = it) }
    }
}

