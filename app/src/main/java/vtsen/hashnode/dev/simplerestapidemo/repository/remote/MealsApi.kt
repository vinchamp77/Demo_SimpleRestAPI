package vtsen.hashnode.dev.simplerestapidemo.repository.remote

import retrofit2.http.GET

interface MealsApi {
    @GET("categories.php")
    suspend fun getMealCategories(): MealCategoriesResponse
}