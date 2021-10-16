package kr.co.bepo.todocompose.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import kr.co.bepo.todocompose.util.Action
import kr.co.bepo.todocompose.util.Constants.TASK_ARGUMENT_KEY
import kr.co.bepo.todocompose.util.Constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    navigationToListScreen: (Action) -> Unit
) {
    composable(
        route = TASK_SCREEN,
        arguments = listOf(navArgument(TASK_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ) { navBackStackEntry ->
        val taskId = navBackStackEntry.arguments!!.getInt(TASK_ARGUMENT_KEY)
    }
}