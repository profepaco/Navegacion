package edu.itsco.navegacion.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import edu.itsco.navegacion.ui.navigation.Screens
import edu.itsco.navegacion.ui.theme.NavegacionTheme

@Composable
fun HomeScreen(navController: NavHostController){
    Scaffold(
        topBar = {
            TopAppBar() {
                Text("Navegando en Compose")
            }
        }
    ) {
        Column(modifier = Modifier.padding(it)) {
            Text("Soy HomeScreen")
            Button(onClick = {
                navController.navigate(route = Screens.Second.route)
            }) {
                Text("Segunda pantalla")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    NavegacionTheme{
        HomeScreen(rememberNavController())
    }
}