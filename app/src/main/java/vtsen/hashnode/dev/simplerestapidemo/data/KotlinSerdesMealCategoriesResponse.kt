package vtsen.hashnode.dev.simplerestapidemo.data

import kotlinx.serialization.Serializable

//Note: Do not know how to get rid of this warning
//Warning:(5, 1) kotlinx.serialization compiler plugin is not applied to the module, so this annotation
//would not be processed. Make sure that you've setup your buildscript correctly and re-import project.
@Serializable
data class KotlinSerdesMealCategoriesResponse (
    val categories: List<MoshiMealCategory>
)