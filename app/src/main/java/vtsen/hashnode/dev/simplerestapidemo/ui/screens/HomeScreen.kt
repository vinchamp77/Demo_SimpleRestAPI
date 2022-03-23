package vtsen.hashnode.dev.simplerestapidemo.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import vtsen.hashnode.dev.simplerestapidemo.viewmodel.MainViewModel

@Composable
fun HomeScreen(
    navigateToMealCategories: () -> Unit,
    viewModel: MainViewModel
) {
    LazyColumn (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        item {
            DefaultButton(
                text = "Retrofit + Moshi",
                onClick = {
                    viewModel.updateMealCategoriesWithRetrofitMoshi()
                    navigateToMealCategories()
                },
            )
        }
        item {
            DefaultButton(
                text = "Retrofit + Gson",
                onClick = {
                    viewModel.updateMealCategoriesWithRetrofitGson()
                    navigateToMealCategories()
                },
            )
        }
        item {
            DefaultButton(
                text = "Retrofit + Kotlin Serdes",
                onClick = {
                    viewModel.updateMealCategoriesWithRetrofitKotlinSerdes()
                    navigateToMealCategories()
                },
            )
        }
    }
}

@Preview
@Composable
fun Preview() {
    HomeScreen({}, MainViewModel(true))
}