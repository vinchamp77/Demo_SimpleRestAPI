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

    suspend fun getRetrofitMoshiMealCategories(enableTest: Boolean): MoshiMealCategoriesResponse
        = withContext(Dispatchers.IO) {

        if (enableTest) {
            repeat(10) {
                retrofitMoshiWebService.getMealCategories()
            }
        }

        return@withContext retrofitMoshiWebService.getMealCategories()
    }

    suspend fun getRetrofitGsonMealCategories(enableTest: Boolean): GsonMealCategoriesResponse
            = withContext(Dispatchers.IO) {

        if (enableTest) {
            repeat(10) {
                retrofitGsonWebService.getMealCategories()
            }
        }

        return@withContext retrofitGsonWebService.getMealCategories()
    }

    suspend fun getRetrofitKotlinSerdesMealCategories(enableTest: Boolean): KotlinSerdesMealCategoriesResponse
            = withContext(Dispatchers.IO) {

        if (enableTest) {
            repeat(10) {
                retrofitKotlinSerdesWebService.getMealCategories()
            }
        }

        return@withContext retrofitKotlinSerdesWebService.getMealCategories()
    }

    suspend fun getKtorKotlinSerdesMealCategories(enableTest: Boolean): KotlinSerdesMealCategoriesResponse
            = withContext(Dispatchers.IO) {

        if (enableTest) {
            repeat(10) {
                ktorKotlinSerdesWebService.getMealCategories()
            }
        }

        return@withContext ktorKotlinSerdesWebService.getMealCategories()
    }
}