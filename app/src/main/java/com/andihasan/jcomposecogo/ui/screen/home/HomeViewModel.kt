package com.andihasan.jcomposecogo.ui.screen.home

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class HomeViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState

    fun updateText(newText: String) {
        _uiState.update {
            it.copy(text = newText)
        }
    }
}

data class HomeUiState(
    val text: String = "Data Real-Time"
)

