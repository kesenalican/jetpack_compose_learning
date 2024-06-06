package com.alicankesen.jetpackcomposelesson

import android.widget.Toast
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

@Composable
fun ToastMessageExample(){
    val context = LocalContext.current
    Button(onClick = {
        Toast.makeText(context, "Şu an toast message görünüyor", Toast.LENGTH_LONG).show()
    }) {
        Text(text = "Toast Button")
    }
}