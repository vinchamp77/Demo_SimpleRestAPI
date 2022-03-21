package vtsen.hashnode.dev.simplerestapidemo.data

data class MoshiMealCategoriesResponse (
    val categories: List<MoshiMealCategory>
)

fun MoshiMealCategoriesResponse.asMealCategories(): List<MealCategory> {
    return categories.map {
        it.asMealCategory()
    }
}
