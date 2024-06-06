package com.alicankesen.jetpackcomposelesson

import android.content.ContentValues
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun DropdownExample() {

    val countryList = listOf("Türkiye", "Almanya", "İtalya", "Fransa","Amerika")
    var countryIndex by remember {
        mutableStateOf(0)
    }
    var control by remember {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.clickable {
                    control = true
                }
            ) {
                Text(text = countryList[countryIndex])
                Image(
                    painter = painterResource(id = R.drawable.baseline_arrow_drop_down_24),
                    contentDescription = "",
                )
            }
            DropdownMenu(expanded =  control, onDismissRequest = {
                //menü dışına tıkladığımda yapılacaklar
                control = false
            }) {
                countryList.forEachIndexed { index, s ->
                    DropdownMenuItem(text = { Text(text = s) }, onClick = {
                        Log.d(ContentValues.TAG, "Tıklananan ülke:$s ")
                        countryIndex = index
                        control = false
                    })
                }


            }
        }

    }
}
