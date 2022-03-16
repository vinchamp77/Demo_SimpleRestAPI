package vtsen.hashnode.dev.simplerestapidemo.repository.remote.retrofitkotlinserdes

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.ExperimentalSerializationApi
import retrofit2.Retrofit
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import vtsen.hashnode.dev.simplerestapidemo.data.KotlinSerdesMealCategoriesResponse
import vtsen.hashnode.dev.simplerestapidemo.repository.MainRepository

class RetrofitKotlinSerdesMealsWebService  {

    private val api: RetrofitKotlinSerdesMealsApi by lazy {
        createMealsApi()
    }

    suspend fun getMealCategories(): KotlinSerdesMealCategoriesResponse {
        return api.getMealCategories()
    }

    @OptIn(ExperimentalSerializationApi::class)
    private fun createMealsApi(): RetrofitKotlinSerdesMealsApi {

        val contentType = "application/json".toMediaType()
        val retrofit = Retrofit.Builder()
            .baseUrl(MainRepository.BASE_URL)
            .addConverterFactory(Json.asConverterFactory(contentType))
            .build()

        return retrofit.create(RetrofitKotlinSerdesMealsApi::class.java)
    }
}