package kr.co.bepo.todocompose.navigation.destinations

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import kr.co.bepo.todocompose.ui.screens.list.ListScreen
import kr.co.bepo.todocompose.ui.viewmodels.SharedViewModel
import kr.co.bepo.todocompose.util.Constants.LIST_ARGUMENT_KEY
import kr.co.bepo.todocompose.util.Constants.LIST_SCREEN
import kr.co.bepo.todocompose.util.toAction

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
    ) { navBackStackEntry ->
        val action = navBackStackEntry.arguments?.getString(LIST_ARGUMENT_KEY).toAction()

        LaunchedEffect(key1 = action) {
            sharedViewModel.action.value = action
        }

        ListScreen(
            navigationToTaskScreen = navigationToTaskScreen,
            sharedViewModel = sharedViewModel
        )
    }
}