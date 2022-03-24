package vtsen.hashnode.dev.simplerestapidemo.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import vtsen.hashnode.dev.simplerestapidemo.viewmodel.MainViewModel

@Composable
fun MealCategoriesScreen(viewModel: MainViewModel) {
    if(viewModel.mealCategories == null) return

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
    ) {
        items(items = viewModel.mealCategories!!) { mealCategory ->
            MealCategoryItem(mealCategory = mealCategory)
        }
    }
}
