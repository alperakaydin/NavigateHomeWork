package com.alperakaydin.navigatehomework.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun SayfaA(navController: NavController){

     Column(
         horizontalAlignment = Alignment.CenterHorizontally,
         verticalArrangement = Arrangement.SpaceEvenly,
         modifier = Modifier.fillMaxSize()
     ) {
         Text(text = "Sayfa A")
         Button(
             onClick = { navController.navigate("sayfab") }
         ) {
             Text(text = " Git B")
         }
     }

}