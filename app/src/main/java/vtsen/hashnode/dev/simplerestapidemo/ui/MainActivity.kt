package vtsen.hashnode.dev.simplerestapidemo.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import vtsen.hashnode.dev.simplerestapidemo.ui.navigation.BuildNavGraph
import vtsen.hashnode.dev.simplerestapidemo.viewmodel.MainViewModel
import vtsen.hashnode.dev.simplerestapidemo.ui.theme.SimpleRestApiAppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MainScreen(viewModel())
        }
    }
}

@Composable
private fun MainScreen(viewModel: MainViewModel) {

    SimpleRestApiAppTheme {
        val navController = rememberNavController()
        BuildNavGraph(navController, viewModel)
    }
}
