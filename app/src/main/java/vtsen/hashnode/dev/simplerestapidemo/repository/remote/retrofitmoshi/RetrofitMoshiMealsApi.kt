package vtsen.hashnode.dev.simplerestapidemo.repository.remote.retrofitmoshi

import retrofit2.http.GET
import vtsen.hashnode.dev.simplerestapidemo.data.MoshiMealCategoriesResponse

interface RetrofitMoshiMealsApi {
    @GET("categories.php")
    suspend fun getMealCategories(): MoshiMealCategoriesResponse
}