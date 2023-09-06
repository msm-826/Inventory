package com.project.inventory.ui.home

import androidx.lifecycle.ViewModel
import com.project.inventory.data.Item

class HomeViewModel : ViewModel() {
    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
}
data class HomeUiState(val itemList: List<Item> = listOf())