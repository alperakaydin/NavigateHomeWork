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
import com.dotlottie.dlplayer.Mode
import com.lottiefiles.dotlottie.core.compose.ui.DotLottieAnimation
import com.lottiefiles.dotlottie.core.util.DotLottieSource


@Composable
fun Anasayfa(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        DotLottieAnimation(
            //source = DotLottieSource.Url("https://lottie.host/embed/5874803e-1c39-4afc-88b6-02b84fdc81c7/uoMz6K7psg.lottie"), // URL of .json or .lottie
            source = DotLottieSource.Asset("cat_animation.json"),
            autoplay = true,
            loop = true,
            speed = 3f,
            useFrameInterpolation = false,
            playMode = Mode.FORWARD,
            //modifier = Modifier.background(Color.LightGray)
        )
        Text(text = "Anasayfa")
        Button(
            onClick = { navController.navigate("sayfaa") }
        ) {
            Text(text = " Git A")
        }
        Button(
            onClick = { navController.navigate("sayfax") }
        ) {
            Text(text = " Git X")
        }
    }

}

