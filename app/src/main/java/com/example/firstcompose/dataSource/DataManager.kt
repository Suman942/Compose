package com.example.firstcompose.dataSource

import androidx.compose.runtime.mutableStateOf
import com.example.firstcompose.models.Quotes
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

object DataManager {
    var dataList = ArrayList<Quotes>()
    var isDataLoaded = mutableStateOf(false)
    fun loadData() {
        CoroutineScope(Dispatchers.IO).launch {
            dataList.add(Quotes("A man with golden heart A man with golden heart A man with golden heart", "Jacobs"))
            dataList.add(Quotes("Silence have secrets", "Robert"))
            dataList.add(Quotes("Rich Dad Poor Dad", "Jacobs"))
            dataList.add(Quotes("A man with golden heart", "Jacobs"))
            dataList.add(Quotes("Silence have secrets", "Robert"))
            dataList.add(Quotes("Rich Dad Poor Dad", "Jacobs"))
            dataList.add(Quotes("A man with golden heart", "Jacobs"))
            dataList.add(Quotes("Silence have secrets", "Robert"))
            dataList.add(Quotes("Rich Dad Poor Dad", "Jacobs"))
            dataList.add(Quotes("A man with golden heart", "Jacobs"))
            dataList.add(Quotes("Silence have secrets", "Robert"))
            dataList.add(Quotes("Rich Dad Poor Dad", "Jacobs"))
            dataList.add(Quotes("A man with golden heart", "Jacobs"))
            dataList.add(Quotes("Silence have secrets", "Robert"))
            dataList.add(Quotes("Rich Dad Poor Dad", "Jacobs"))
            dataList.add(Quotes("A man with golden heart", "Jacobs"))
            dataList.add(Quotes("Silence have secrets", "Robert"))
            dataList.add(Quotes("Rich Dad Poor Dad", "Jacobs"))
            isDataLoaded.value = true
        }
    }
    // pages
    var currentPage = mutableStateOf(Pages.LISTING)
    var currentQuote : Quotes? = null
    fun switchPage(quotes: Quotes?){
        if (currentPage.value == Pages.LISTING){
            currentQuote = quotes
            currentPage.value = Pages.DETAILS
        }else{
            currentPage.value = Pages.LISTING
        }
    }

}