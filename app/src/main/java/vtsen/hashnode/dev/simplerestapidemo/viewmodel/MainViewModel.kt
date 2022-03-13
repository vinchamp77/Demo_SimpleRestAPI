package vtsen.hashnode.dev.simplerestapidemo.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import vtsen.hashnode.dev.simplerestapidemo.repository.MainRepository
import vtsen.hashnode.dev.simplerestapidemo.repository.remote.RetrofitMoshiMealsWebService

class MainViewModel(preview: Boolean = false) : ViewModel() {
    private val repository = MainRepository(
        RetrofitMoshiMealsWebService(),
    )

    init {
        viewModelScope.launch {
            val response = repository.getMealCategories()
            Log.d("ViewModelDebug", response.toString())
        }
    }

    fun init() {

    }
}