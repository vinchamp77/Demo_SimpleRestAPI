package vtsen.hashnode.dev.simplerestapidemo.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import vtsen.hashnode.dev.simplerestapidemo.repository.remote.MealCategoriesResponse
import vtsen.hashnode.dev.simplerestapidemo.repository.remote.MealsWebService

private const val URL = "https://vtsen.hashnode.dev/rss.xml"

class MainRepository(
    private val webService: MealsWebService,
) {

    suspend fun getMealCategories(): MealCategoriesResponse = withContext(Dispatchers.IO) {
        return@withContext webService.getMealCategories()
    }
}