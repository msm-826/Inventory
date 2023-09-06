package com.project.inventory.ui

import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.project.inventory.InventoryApplication
import com.project.inventory.ui.home.HomeViewModel
import com.project.inventory.ui.item.ItemEntryViewModel

object AppViewModelProvider {
    val Factory = viewModelFactory {

        /*initializer {
            ItemEditViewModel(
                this.createSavedStateHandle()
            )
        }*/

        initializer {
            ItemEntryViewModel()
        }

        /*initializer {
            ItemDetailsViewModel(
                this.createSavedStateHandle()
            )
        }*/

        initializer {
            HomeViewModel()
        }
    }
}

fun CreationExtras.inventoryApplication(): InventoryApplication =
    (this[AndroidViewModelFactory.APPLICATION_KEY] as InventoryApplication)