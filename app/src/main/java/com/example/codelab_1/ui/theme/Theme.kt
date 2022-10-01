package com.example.codelab_1.ui.theme

import android.graphics.Color
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color.Companion.White

private val DarkColorPalette = darkColors(
    surface = Orange,
    onSurface = Chartreuse,
    primary = DarkOrange,
    onPrimary = LightOrange
)


private val LightColorPalette = lightColors(
    surface = Orange,
    onSurface = Chartreuse,
    primary = LightOrange,
    onPrimary = DarkOrange
)



@Composable
fun Codelab1Theme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}

