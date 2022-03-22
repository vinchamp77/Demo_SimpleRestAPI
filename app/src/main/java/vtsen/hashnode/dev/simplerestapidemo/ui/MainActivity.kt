package vtsen.hashnode.dev.simplerestapidemo.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import vtsen.hashnode.dev.simplerestapidemo.ui.navigation.BuildNavGraph
import vtsen.hashnode.dev.simplerestapidemo.viewmodel.MainViewModel
import vtsen.hashnode.dev.simplerestapidemo.ui.theme.SimpleRestApiAppTheme

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SimpleRestApiAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen(viewModel)
                }
            }
        }
    }
}

@Composable
private fun MainScreen(viewModel: MainViewModel) {
    val navController = rememberNavController()
    BuildNavGraph(navController, viewModel)
}
