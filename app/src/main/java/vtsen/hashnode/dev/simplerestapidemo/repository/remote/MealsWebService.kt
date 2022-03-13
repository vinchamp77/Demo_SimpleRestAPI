package vtsen.hashnode.dev.simplerestapidemo.repository.remote

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

abstract class MealsWebService {

    protected val baseUrl = "https://www.themealdb.com/api/json/v1/1/"

    private val api: MealsApi by lazy {
        createMealsApi()
    }

    abstract fun createMealsApi(): MealsApi

    suspend fun getMealCategories(): MealCategoriesResponse {
        return api.getMealCategories()
    }
}