package vtsen.hashnode.dev.simplerestapidemo.data

import com.google.gson.annotations.SerializedName

class GsonMealCategory(
    @SerializedName("idCategory") val id: String,
    val strCategory: String,
    val strCategoryDescription: String,
    val strCategoryThumb: String
)