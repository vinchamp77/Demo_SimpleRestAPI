package vtsen.hashnode.dev.simplerestapidemo.ui.sreens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import vtsen.hashnode.dev.simplerestapidemo.viewmodel.MainViewModel

@Composable
fun HomeScreen(
    navigateToMealCategories: () -> Unit,
    viewModel: MainViewModel
) {
    Column (
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Login Screen", fontSize = 40.sp)

//        DefaultButton(
//            text = "Log In",
//            onClick = navigateToHome
//        )
    }
}