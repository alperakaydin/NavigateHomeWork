package com.alperakaydin.navigatehomework.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Routes(navController: NavController){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "anasayfa"){
        composable("anasayfa"){
            Anasayfa(navController)
        }
        composable("sayfaa"){
            SayfaA(navController)
        }
        composable("sayfab"){
            SayfaB(navController)
        }
        composable("sayfax"){
            SayfaX(navController)
            }
        composable("sayfay"){
            SayfaY(navController)
        }
    }
}
