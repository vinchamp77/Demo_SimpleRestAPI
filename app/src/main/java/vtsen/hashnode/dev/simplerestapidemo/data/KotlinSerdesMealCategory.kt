package vtsen.hashnode.dev.simplerestapidemo.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class KotlinSerdesMealCategory(
    @SerialName("idCategory")  val idCategory: String,
    val strCategory: String,
    val strCategoryDescription: String,
    val strCategoryThumb: String
)