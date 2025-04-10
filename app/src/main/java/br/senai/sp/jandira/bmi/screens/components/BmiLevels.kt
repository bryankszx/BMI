package br.senai.sp.jandira.bmi.screens.components

import android.opengl.ETC1Util.ETC1Texture
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.FlowRowScopeInstance.weight
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BmiLevel(
    bulletColor: Color,
    leftText: String = "",
    rightText: String = "",
    isFilled: Boolean = true
){
 Row (
     modifier = Modifier.fillMaxWidth().height(100.dp)
 ){
     Card(
         modifier = Modifier
             .size(40.dp),
         shape = CircleShape
     ) { }
 }
    Spacer(modifier = Modifier.width(16.dp))
    Card (
        modifier = Modifier
            .height(80.dp)
            .fillMaxWidth(),
        colors = CardDefaults
            .cardColors(containerColor = Color.Cyan)

    ){
        Row (
            modifier = Modifier
                .padding(8.dp)
                .fillMaxSize(),
            horizontalArrangement = Arrangement.Center
        ){
            Text(text = "Texto 1")
            Text(text = "Texto 2")
        }
    }
}


@Preview
@Composable
private fun BmiLevelPreview(){
    BmiLevel()
}