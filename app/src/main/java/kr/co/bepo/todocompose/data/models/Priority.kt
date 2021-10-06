package kr.co.bepo.todocompose.data.models

import androidx.compose.ui.graphics.Color
import kr.co.bepo.todocompose.ui.theme.HighPriorityColor
import kr.co.bepo.todocompose.ui.theme.LowPriorityColor
import kr.co.bepo.todocompose.ui.theme.MediumPriorityColor
import kr.co.bepo.todocompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    LOW(LowPriorityColor),
    MEDIUM(MediumPriorityColor),
    HIGH(HighPriorityColor),
    NONE(NonePriorityColor)
}