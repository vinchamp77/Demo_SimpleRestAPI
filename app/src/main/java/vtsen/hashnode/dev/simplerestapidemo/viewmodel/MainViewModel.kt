package vtsen.hashnode.dev.simplerestapidemo.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import vtsen.hashnode.dev.simplerestapidemo.data.MealCategory
import vtsen.hashnode.dev.simplerestapidemo.data.asMealCategories
import vtsen.hashnode.dev.simplerestapidemo.repository.MainRepository
import vtsen.hashnode.dev.simplerestapidemo.repository.remote.retrofitgson.RetrofitGsonMealsWebService
import vtsen.hashnode.dev.simplerestapidemo.repository.remote.retrofitkotlinserdes.RetrofitKotlinSerdesMealsWebService
import vtsen.hashnode.dev.simplerestapidemo.repository.remote.retrofitmoshi.RetrofitMoshiMealsWebService

class MainViewModel(preview: Boolean = false) : ViewModel() {

    var mealCategories: List<MealCategory>? by mutableStateOf(null)
        private set

    private val repository = MainRepository(
        RetrofitMoshiMealsWebService(),
        RetrofitKotlinSerdesMealsWebService(),
        RetrofitGsonMealsWebService()
    )

    init {
        viewModelScope.launch {
            val response = repository.getRetrofitMoshiMealCategories()
            //val response = repository.getRetrofitKotlinSerdesMealCategories()
            //val response = repository.getRetrofitGsonMealCategories()
            //Log.d("ViewModelDebug", response.toString())

            mealCategories = response.asMealCategories()
        }
    }

    fun init() {

    }
}