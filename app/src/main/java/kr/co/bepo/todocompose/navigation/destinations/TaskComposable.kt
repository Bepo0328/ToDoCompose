package kr.co.bepo.todocompose.navigation.destinations

import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import kr.co.bepo.todocompose.ui.screens.task.TaskScreen
import kr.co.bepo.todocompose.ui.viewmodels.SharedViewModel
import kr.co.bepo.todocompose.util.Action
import kr.co.bepo.todocompose.util.Constants.TASK_ARGUMENT_KEY
import kr.co.bepo.todocompose.util.Constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    sharedViewModel: SharedViewModel,
    navigationToListScreen: (Action) -> Unit
) {
    composable(
        route = TASK_SCREEN,
        arguments = listOf(navArgument(TASK_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ) { navBackStackEntry ->
        val taskId = navBackStackEntry.arguments!!.getInt(TASK_ARGUMENT_KEY)
        sharedViewModel.getSelectedTask(taskId = taskId)
        val selectedTask by sharedViewModel.selectedTask.collectAsState()

        LaunchedEffect(key1 = selectedTask) {
            if (selectedTask != null || taskId == -1) {
                sharedViewModel.updateTaskFields(selectedTask = selectedTask)
            }
        }
        
        TaskScreen(
            selectedTask = selectedTask,
            sharedViewModel = sharedViewModel,
            navigateToListScreen = navigationToListScreen
        )
    }
}