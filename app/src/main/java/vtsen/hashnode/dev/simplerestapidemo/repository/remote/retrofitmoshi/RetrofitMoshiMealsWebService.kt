package vtsen.hashnode.dev.simplerestapidemo.repository.remote.retrofitmoshi

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import vtsen.hashnode.dev.simplerestapidemo.data.MoshiMealCategoriesResponse
import vtsen.hashnode.dev.simplerestapidemo.repository.MainRepository

class RetrofitMoshiMealsWebService {

    private val api: RetrofitMoshiMealsApi by lazy {
        createMealsApi()
    }

    suspend fun getMealCategories(): MoshiMealCategoriesResponse {
        return api.getMealCategories()
    }

    private fun createMealsApi(): RetrofitMoshiMealsApi {
        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(MainRepository.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()

        return retrofit.create(RetrofitMoshiMealsApi::class.java)
    }
}