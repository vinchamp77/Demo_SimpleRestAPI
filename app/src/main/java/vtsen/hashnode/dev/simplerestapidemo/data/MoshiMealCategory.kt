package vtsen.hashnode.dev.simplerestapidemo.data

import com.squareup.moshi.Json
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

class MoshiMealCategory(
    @Json(name="idCategory") val idCategory: String,
    val strCategory: String,
    val strCategoryDescription: String,
    val strCategoryThumb: String
)