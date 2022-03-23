package vtsen.hashnode.dev.simplerestapidemo.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import vtsen.hashnode.dev.simplerestapidemo.ui.screens.HomeScreen
import vtsen.hashnode.dev.simplerestapidemo.ui.screens.MealCategoriesScreen
import vtsen.hashnode.dev.simplerestapidemo.viewmodel.MainViewModel

@Composable
fun BuildNavGraph(navController: NavHostController, viewModel: MainViewModel) {

    NavHost(
        navController = navController,
        startDestination = NavRoute.Home.path
    ) {

        addHomeScreen(navController,this, viewModel)

        addMealCategoriesScreen(this, viewModel)
    }
}

private fun addHomeScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder,
    viewModel: MainViewModel
) {
    navGraphBuilder.composable(route = NavRoute.Home.path) {
        HomeScreen(
            navigateToMealCategories = {
                navController.navigate(NavRoute.MealCategories.path)
            },
            viewModel = viewModel,
        )
    }
}

private fun addMealCategoriesScreen(
    navGraphBuilder: NavGraphBuilder,
    viewModel: MainViewModel
) {
    navGraphBuilder.composable(route = NavRoute.MealCategories.path) {
        MealCategoriesScreen(viewModel)
    }
}
