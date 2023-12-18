package com.example.firstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.firstcompose.models.Quotes
import com.example.firstcompose.screens.QuoteListScreen
import com.example.firstcompose.screens.QuotesListItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    var dataList = ArrayList<Quotes>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CoroutineScope(Dispatchers.IO).launch { dataList.add(Quotes("A man with golden heart","Jacobs"))
            dataList.add(Quotes("Silence have secrets","Robert"))
            dataList.add(Quotes("Rich Dad Poor Dad","Jacobs"))
            dataList.add(Quotes("A man with golden heart","Jacobs"))
            dataList.add(Quotes("Silence have secrets","Robert"))
            dataList.add(Quotes("Rich Dad Poor Dad","Jacobs"))
            dataList.add(Quotes("A man with golden heart","Jacobs"))
            dataList.add(Quotes("Silence have secrets","Robert"))
            dataList.add(Quotes("Rich Dad Poor Dad","Jacobs"))  }


        setContent {
           Home(dataList)
        }
    }
}

@Composable
fun Home(dataList: ArrayList<Quotes>){
    QuoteListScreen(data = dataList) {

    }
}