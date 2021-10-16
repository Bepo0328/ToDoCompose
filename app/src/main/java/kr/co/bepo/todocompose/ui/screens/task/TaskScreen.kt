package kr.co.bepo.todocompose.ui.screens.task

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import kr.co.bepo.todocompose.util.Action

@Composable
fun TaskScreen(
    navigateToListScreen: (Action) -> Unit
) {
    Scaffold(
        topBar = {
            TaskAppBar(navigateToListScreen = navigateToListScreen)
        },
        content = {}
    )
}