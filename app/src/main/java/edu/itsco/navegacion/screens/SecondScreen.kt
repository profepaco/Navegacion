package edu.itsco.navegacion.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SecondScreen(){
    Scaffold(
        topBar = {
            TopAppBar() {
                Text("Segunda pantalla")
            }
        }
    ) {
        Column(modifier = Modifier.padding(it)) {
            Text("Soy SecondScreen")
            Button(onClick = { /*TODO*/ }) {
                Text("HomeScreen")
            }
        }
    }
}