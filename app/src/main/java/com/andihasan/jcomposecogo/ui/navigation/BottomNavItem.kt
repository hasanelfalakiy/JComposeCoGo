package com.andihasan.jcomposecogo.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val route: String,
    val label: String,
    val icon: ImageVector
) {
    object Home : BottomNavItem("home", "Beranda", Icons.Default.Home)
    object Tools : BottomNavItem("tools", "Alat", Icons.Default.Build)
    object Calendar : BottomNavItem("calendar", "Kalender", Icons.Default.DateRange)
    object Settings : BottomNavItem("settings", "Pengaturan", Icons.Default.Settings)
}
