package kr.co.bepo.todocompose.ui.screens.task

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import kr.co.bepo.todocompose.data.models.ToDoTask
import kr.co.bepo.todocompose.util.Action

@Composable
fun TaskScreen(
    selectedTask: ToDoTask?,
    navigateToListScreen: (Action) -> Unit
) {
    Scaffold(
        topBar = {
            TaskAppBar(
                selectedTask = selectedTask,
                navigateToListScreen = navigateToListScreen
            )
        },
        content = {}
    )
}