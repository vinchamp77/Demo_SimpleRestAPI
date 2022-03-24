package vtsen.hashnode.dev.simplerestapidemo.data

import com.squareup.moshi.Json
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

data class MoshiMealCategory(
    @Json(name="idCategory") val idCategory: String,
    val strCategory: String,
    val strCategoryDescription: String,
    val strCategoryThumb: String
)

fun MoshiMealCategory.asMealCategory(): MealCategory {
    return MealCategory (
        id = idCategory,
        name = strCategory,
        description = strCategoryDescription,
        imageUrl = strCategoryThumb,
    )
}