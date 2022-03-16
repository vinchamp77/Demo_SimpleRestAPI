package vtsen.hashnode.dev.simplerestapidemo.repository.remote.retrofitkotlinserdes

import retrofit2.http.GET
import vtsen.hashnode.dev.simplerestapidemo.data.KotlinSerdesMealCategoriesResponse
import vtsen.hashnode.dev.simplerestapidemo.data.MoshiMealCategoriesResponse

interface RetrofitKotlinSerdesMealsApi {
    @GET("categories.php")
    suspend fun getMealCategories(): KotlinSerdesMealCategoriesResponse
}