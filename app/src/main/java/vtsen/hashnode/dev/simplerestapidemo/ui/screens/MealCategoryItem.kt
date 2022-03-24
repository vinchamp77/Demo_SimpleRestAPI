package vtsen.hashnode.dev.simplerestapidemo.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import vtsen.hashnode.dev.simplerestapidemo.data.MealCategory

@Composable
fun MealCategoryItem(
    mealCategory: MealCategory,
) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {

        Divider(thickness = 2.dp)
    }
}


