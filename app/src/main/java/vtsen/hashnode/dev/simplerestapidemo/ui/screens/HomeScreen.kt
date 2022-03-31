package vtsen.hashnode.dev.simplerestapidemo.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import vtsen.hashnode.dev.simplerestapidemo.R
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
                text = stringResource(R.string.retrofit_moshi),
                onClick = {
                    viewModel.updateMealCategoriesWithRetrofitMoshi()
                    navigateToMealCategories()
                },
            )
        }

        item {
            DefaultButton(
                text = stringResource(R.string.retrofit_gson),
                onClick = {
                    viewModel.updateMealCategoriesWithRetrofitGson()
                    navigateToMealCategories()
                },
            )
        }

        item {
            DefaultButton(
                text = stringResource(R.string.retrofit_kotlin_serdes),
                onClick = {
                    viewModel.updateMealCategoriesWithRetrofitKotlinSerdes()
                    navigateToMealCategories()
                },
            )
        }

        item {
            DefaultButton(
                text = stringResource(R.string.ktor_kotlin_serdes),
                onClick = {
                    viewModel.updateMealCategoriesWithKtorKotlinSerdes()
                    navigateToMealCategories()
                },
            )
        }

        item {

            Spacer(modifier = Modifier.height(10.dp))

            Row (
                modifier = Modifier.size(width = 300.dp, height = 70.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Checkbox(
                    checked = viewModel.enablePerformanceTest,
                    onCheckedChange = { value ->
                        viewModel.onEnablePerformanceTestClick(value)
                    }
                )

                Text(
                    text = "Enable Performance Test",
                    fontSize = 20.sp)
            }
        }
    }
}

@Preview
@Composable
fun Preview() {
    HomeScreen({}, MainViewModel(true))
}