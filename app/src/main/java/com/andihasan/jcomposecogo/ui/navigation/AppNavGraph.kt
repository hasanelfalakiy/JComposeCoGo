package com.andihasan.jcomposecogo.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.andihasan.jcomposecogo.ui.screen.home.HomeScreen
import com.andihasan.jcomposecogo.ui.screen.tools.ToolsScreen
import com.andihasan.jcomposecogo.ui.screen.calendar.CalendarScreen
import com.andihasan.jcomposecogo.ui.screen.settings.SettingsScreen

@Composable
fun AppNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {

    NavHost(
        navController = navController,
        startDestination = BottomNavItem.Home.route,
        modifier = modifier
    ) {

        composable(BottomNavItem.Home.route) {
            HomeScreen()
        }

        composable(BottomNavItem.Tools.route) {
            ToolsScreen()
        }

        composable(BottomNavItem.Calendar.route) {
            CalendarScreen()
        }

        composable(BottomNavItem.Settings.route) {
            SettingsScreen()
        }
    }
}