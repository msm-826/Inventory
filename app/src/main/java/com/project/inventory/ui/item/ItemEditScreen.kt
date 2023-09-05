package com.project.inventory.ui.item

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.project.inventory.R
import com.project.inventory.ui.navigation.NavigationDestination

object ItemEditDestination : NavigationDestination {
    override val route = "item_edit"
    override val titleRes = R.string.edit_item_title
    const val itemIdArg = "itemId"
    val routeWithArgs = "$route/{$itemIdArg}"
}

@Composable
fun ItemEditScreen(
    navigateBack: () -> Unit,
    onNavigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {

}