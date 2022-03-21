package vtsen.hashnode.dev.simplerestapidemo.data

import kotlinx.serialization.Serializable

@Serializable
data class KotlinSerdesMealCategoriesResponse (
    val categories: List<KotlinSerdesMealCategory>
)

fun KotlinSerdesMealCategoriesResponse.asMealCategories(): List<MealCategory> {
    return categories.map {
        it.asMealCategory()
    }
}