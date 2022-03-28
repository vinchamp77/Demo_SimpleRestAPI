package vtsen.hashnode.dev.simplerestapidemo.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import vtsen.hashnode.dev.simplerestapidemo.data.GsonMealCategoriesResponse
import vtsen.hashnode.dev.simplerestapidemo.data.KotlinSerdesMealCategoriesResponse
import vtsen.hashnode.dev.simplerestapidemo.data.MoshiMealCategoriesResponse
import vtsen.hashnode.dev.simplerestapidemo.repository.remote.ktorkotlinserdes.KtorKotlinSerdesMealsWebService
import vtsen.hashnode.dev.simplerestapidemo.repository.remote.retrofitgson.RetrofitGsonMealsWebService
import vtsen.hashnode.dev.simplerestapidemo.repository.remote.retrofitkotlinserdes.RetrofitKotlinSerdesMealsWebService
import vtsen.hashnode.dev.simplerestapidemo.repository.remote.retrofitmoshi.RetrofitMoshiMealsWebService

class MainRepository(
    private val retrofitMoshiWebService: RetrofitMoshiMealsWebService,
    private val retrofitGsonWebService: RetrofitGsonMealsWebService,
    private val retrofitKotlinSerdesWebService: RetrofitKotlinSerdesMealsWebService,
    private val ktorKotlinSerdesWebService: KtorKotlinSerdesMealsWebService,
) {

    companion object {
        const val BASE_URL = "https://www.themealdb.com/api/json/v1/1/"
    }

    suspend fun getRetrofitMoshiMealCategories(): MoshiMealCategoriesResponse
        = withContext(Dispatchers.IO) {
        return@withContext retrofitMoshiWebService.getMealCategories()
    }

    suspend fun getRetrofitGsonMealCategories(): GsonMealCategoriesResponse
            = withContext(Dispatchers.IO) {
        return@withContext retrofitGsonWebService.getMealCategories()
    }

    suspend fun getRetrofitKotlinSerdesMealCategories(): KotlinSerdesMealCategoriesResponse
            = withContext(Dispatchers.IO) {
        return@withContext retrofitKotlinSerdesWebService.getMealCategories()
    }

    suspend fun getKtorKotlinSerdesMealCategories(): KotlinSerdesMealCategoriesResponse
            = withContext(Dispatchers.IO) {
        return@withContext ktorKotlinSerdesWebService.getMealCategories()
    }
}