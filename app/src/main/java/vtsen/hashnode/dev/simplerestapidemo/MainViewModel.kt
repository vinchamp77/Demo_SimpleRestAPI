package vtsen.hashnode.dev.simplerestapidemo

import android.content.Context
import androidx.lifecycle.ViewModel


class MainViewModel(preview: Boolean = false) : ViewModel() {
    private val repository = MainRepository(
        MealsWebService(),
    )
}