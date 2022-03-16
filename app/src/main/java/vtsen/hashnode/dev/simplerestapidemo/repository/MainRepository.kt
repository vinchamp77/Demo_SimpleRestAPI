package vtsen.hashnode.dev.simplerestapidemo.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import vtsen.hashnode.dev.simplerestapidemo.data.KotlinSerdesMealCategoriesResponse
import vtsen.hashnode.dev.simplerestapidemo.data.MoshiMealCategoriesResponse
import vtsen.hashnode.dev.simplerestapidemo.repository.remote.retrofitkotlinserdes.RetrofitKotlinSerdesMealsWebService
import vtsen.hashnode.dev.simplerestapidemo.repository.remote.retrofitmoshi.RetrofitMoshiMealsWebService

class MainRepository(
    private val retrofitMoshiWebService: RetrofitMoshiMealsWebService,
    private val retrofitKotlinSerdesWebService: RetrofitKotlinSerdesMealsWebService,
) {

    companion object {
        const val BASE_URL = "https://www.themealdb.com/api/json/v1/1/"
    }

    suspend fun getRetrofitMoshiMealCategories(): MoshiMealCategoriesResponse
        = withContext(Dispatchers.IO) {
        return@withContext retrofitMoshiWebService.getMealCategories()
    }

    suspend fun getRetrofitKotlinSerdesMealCategories(): KotlinSerdesMealCategoriesResponse
            = withContext(Dispatchers.IO) {
        return@withContext retrofitKotlinSerdesWebService.getMealCategories()
    }
}