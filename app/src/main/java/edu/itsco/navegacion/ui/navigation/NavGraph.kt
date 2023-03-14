package edu.itsco.navegacion.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import edu.itsco.navegacion.screens.HomeScreen
import edu.itsco.navegacion.screens.SecondScreen


@Composable
fun NavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screens.Home.route
    ){
        composable(
            route = Screens.Home.route
        ){
            HomeScreen(navController = navController)
        }
        composable(
            route = Screens.Second.route
        ){
            SecondScreen()
        }
    }
}

