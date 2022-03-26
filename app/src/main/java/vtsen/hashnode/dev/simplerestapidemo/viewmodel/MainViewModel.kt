package vtsen.hashnode.dev.simplerestapidemo.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import vtsen.hashnode.dev.simplerestapidemo.R
import vtsen.hashnode.dev.simplerestapidemo.data.MealCategory
import vtsen.hashnode.dev.simplerestapidemo.data.asMealCategories
import vtsen.hashnode.dev.simplerestapidemo.repository.MainRepository
import vtsen.hashnode.dev.simplerestapidemo.repository.remote.retrofitgson.RetrofitGsonMealsWebService
import vtsen.hashnode.dev.simplerestapidemo.repository.remote.retrofitkotlinserdes.RetrofitKotlinSerdesMealsWebService
import vtsen.hashnode.dev.simplerestapidemo.repository.remote.retrofitmoshi.RetrofitMoshiMealsWebService

class MainViewModel(preview: Boolean = false) : ViewModel() {

    var mealCategories: List<MealCategory>? by mutableStateOf(null)
        private set

    var mealsCategoryTitleStrId: Int? by mutableStateOf(null)

    private val repository = MainRepository(
        RetrofitMoshiMealsWebService(),
        RetrofitKotlinSerdesMealsWebService(),
        RetrofitGsonMealsWebService()
    )

    fun updateMealCategoriesWithRetrofitMoshi() = viewModelScope.launch {

        mealCategories = null
        mealsCategoryTitleStrId = R.string.retrofit_moshi

        val response = repository.getRetrofitMoshiMealCategories()
        mealCategories = response.asMealCategories()


    }

    fun updateMealCategoriesWithRetrofitGson() = viewModelScope.launch {

        mealCategories = null
        mealsCategoryTitleStrId = R.string.retrofit_gson

        val response = repository.getRetrofitGsonMealCategories()
        mealCategories = response.asMealCategories()
    }

    fun updateMealCategoriesWithRetrofitKotlinSerdes() = viewModelScope.launch {

        mealCategories = null
        mealsCategoryTitleStrId = R.string.retrofit_kotlin_serdes

        val response = repository.getRetrofitKotlinSerdesMealCategories()
        mealCategories = response.asMealCategories()
    }
}