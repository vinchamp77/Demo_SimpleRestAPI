package vtsen.hashnode.dev.simplerestapidemo.repository.remote.retrofitgson

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import vtsen.hashnode.dev.simplerestapidemo.data.GsonMealCategoriesResponse
import vtsen.hashnode.dev.simplerestapidemo.repository.MainRepository

class RetrofitGsonMealsWebService {

    private val api: RetrofitGsonMealsApi by lazy {
        createMealsApi()
    }

    suspend fun getMealCategories(): GsonMealCategoriesResponse {
        return api.getMealCategories()
    }

    private fun createMealsApi(): RetrofitGsonMealsApi {

        val gsonConverterFactory = GsonConverterFactory.create()

        val retrofit = Retrofit.Builder()
            .baseUrl(MainRepository.BASE_URL)
            .addConverterFactory(gsonConverterFactory)
            .build()

        return retrofit.create(RetrofitGsonMealsApi::class.java)
    }
}