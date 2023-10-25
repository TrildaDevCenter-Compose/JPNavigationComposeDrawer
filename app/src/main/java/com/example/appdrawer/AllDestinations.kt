package com.example.appdrawer

import androidx.navigation.NavHostController
import com.example.appdrawer.AllDestinations.HOME
import com.example.appdrawer.AllDestinations.SETTINGS

object AllDestinations {
    const val HOME = "Home"
    const val SETTINGS = "Settings"
}

class AppNavigationActions(private val navController: NavHostController) {

    fun navigateToHome() {
        navController.navigate(HOME) {
            popUpTo(HOME)
        }
    }

    fun navigateToSettings() {
        navController.navigate(SETTINGS) {
            launchSingleTop = true
            restoreState = true
        }
    }
}
