package br.senai.sp.jandira.bmi.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun UserDataScreen(modifier: Modifier){
 Box(
 modifier = Modifier
     .fillMaxSize()
     .background(color = Color.White)

 )
}
@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    UserDataScreen()
}