package kr.co.bepo.todocompose.navigation.destinations

import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import kr.co.bepo.todocompose.ui.screens.list.ListScreen
import kr.co.bepo.todocompose.ui.viewmodels.SharedViewModel
import kr.co.bepo.todocompose.util.Constants.LIST_ARGUMENT_KEY
import kr.co.bepo.todocompose.util.Constants.LIST_SCREEN

@ExperimentalMaterialApi
fun NavGraphBuilder.listComposable(
    navigationToTaskScreen: (taskId: Int) -> Unit,
    sharedViewModel: SharedViewModel
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY) {
            type = NavType.StringType
        })
    ) {
        ListScreen(
            navigationToTaskScreen = navigationToTaskScreen,
            sharedViewModel = sharedViewModel
        )
    }
}