package vtsen.hashnode.dev.simplerestapidemo.data

import com.google.gson.annotations.SerializedName

class GsonMealCategory(
    @SerializedName("idCategory") val idCategory: String,
    val strCategory: String,
    val strCategoryDescription: String,
    val strCategoryThumb: String
)

fun GsonMealCategory.asMealCategory(): MealCategory {
    return MealCategory (
        id = idCategory,
        name = strCategory,
        description = strCategoryDescription,
        imageUrl = strCategoryThumb,
    )
}