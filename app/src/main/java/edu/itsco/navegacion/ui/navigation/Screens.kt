package edu.itsco.navegacion.ui.navigation

sealed class Screens(val route: String){
    object Home: Screens(route = "home")
    object Second: Screens(route = "second")
}
