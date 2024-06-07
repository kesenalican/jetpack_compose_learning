package com.alicankesen.jetpackcomposelesson

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AppBarExample() {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Jetpack Compose Bar")
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = colorResource(id = R.color.purple_200),
                    titleContentColor = colorResource(id = R.color.teal_700)

                ),
                actions = {
                    Text(text = "Tıkla", Modifier.clickable {
                        Log.d("tiklandi", "tıklandı")

                    })
                    IconButton(onClick = {
                        Log.d("tiklandi", "tıklandı")
                    }) {
                        Icon(Icons.Filled.Add, contentDescription = "")

                    }
                }
            )
        },

        content = {
            Column(Modifier.padding(it)) {

            }
        },
    )

}
