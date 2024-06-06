package com.alicankesen.jetpackcomposelesson.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun Example1(){
    var number by remember {
        mutableStateOf(0)
    }

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
    ) {
        Text(text = number.toString(), fontSize = 25.sp)

        Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly){
            OutlinedButton(onClick = {number--}, modifier = Modifier
                .fillMaxWidth()
                .weight(50f), colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red
            ) ) {
                Text(text = "Azalt")
            }
            Button(onClick = { number++ },modifier = Modifier
                .fillMaxWidth()
                .weight(50f),

                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Green

                )
            ) {
                Text(text = "Arttır")
            }
        }
    }
    /*Column (
        modifier = Modifier.padding(25.dp), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Jetpack")
        Text(text = "Compose")
        Text(text = "Greeting")
    }*/

    /* Row(modifier = Modifier.padding(10.dp),
         verticalAlignment = Alignment.CenterVertically,
         horizontalArrangement = Arrangement.SpaceBetween,)
     {
         Text(text = "alican")
         Text(text = "alican")
         Text(text = "alican")
     }*/
    /*   Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
           Box(modifier = Modifier.size(100.dp).background(color = Color.Cyan))
           Box(modifier = Modifier.size(75.dp).background(color = Color.White))
           Box(modifier = Modifier.size(50.dp).background(color = Color.Magenta))
       }*/
    /*Column {
        MyText(text = "alican", color = Color.Magenta , size =25 )
        MyText(text = "alican", color = Color.White, size =25 )
        MyText(text = "alican", color = Color.Black , size =25 )
        MyText(text = "alican", color = Color.Blue , size =25 )
    }*/
    /* var number = remember{
         mutableStateOf(0)
     }
     Column(modifier = Modifier.fillMaxSize(),

         horizontalAlignment = Alignment.CenterHorizontally,
         verticalArrangement = Arrangement.SpaceEvenly) {
         Text(text = number.value.toString())
         Row (horizontalArrangement = Arrangement.SpaceEvenly){
             Text(text = "Add",

                 modifier = Modifier.clickable {
                 number.value++;

             }.padding(20.dp))
             Text(text = "Azalt", modifier = Modifier.clickable {
                 number.value--;
             })
         }
     }*/
}