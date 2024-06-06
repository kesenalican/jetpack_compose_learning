package com.alicankesen.jetpackcomposelesson

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun RadioExample() {
    val myList= listOf<String>("Kotlin", "Java")
    var myIndex by remember {
        mutableStateOf(0)
    }
    var mySelect by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        Text(text = mySelect)
        myList.forEachIndexed { index, s ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(selected = s == myList[myIndex], onClick = {
                    myIndex  = index
                    mySelect = s
                })
                Text(text = s)
            }
        }
    }
}