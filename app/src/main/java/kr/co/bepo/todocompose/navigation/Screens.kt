package kr.co.bepo.todocompose.navigation

import androidx.navigation.NavHostController
import kr.co.bepo.todocompose.util.Action
import kr.co.bepo.todocompose.util.Constants.LIST_SCREEN

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate(route = "list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate(route = "task/$taskId")
    }
}