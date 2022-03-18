package vtsen.hashnode.dev.simplerestapidemo.repository.remote.retrofitgson

import retrofit2.http.GET
import vtsen.hashnode.dev.simplerestapidemo.data.GsonMealCategoriesResponse

interface RetrofitGsonMealsApi {
    @GET("categories.php")
    suspend fun getMealCategories(): GsonMealCategoriesResponse
}