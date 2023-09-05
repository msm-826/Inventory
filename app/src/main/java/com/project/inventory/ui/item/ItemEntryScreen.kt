package com.project.inventory.ui.item

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.project.inventory.R
import com.project.inventory.ui.navigation.NavigationDestination

object ItemEntryDestination : NavigationDestination {
    override val route = "item_entry"
    override val titleRes = R.string.item_entry_title
}

@Composable
fun ItemEntryScreen(
    navigateBack: () -> Unit,
    onNavigateUp: () -> Unit,
) {
    Text(text = "ItemEntryScreen")
}