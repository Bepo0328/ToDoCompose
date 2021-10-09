package kr.co.bepo.todocompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import kr.co.bepo.todocompose.navigation.destinations.listComposable
import kr.co.bepo.todocompose.navigation.destinations.taskComposable
import kr.co.bepo.todocompose.util.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(
    navController: NavHostController
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigationToTaskScreen = screen.task
        )
        taskComposable(
            navigationToListScreen = screen.list
        )
    }
}