package vtsen.hashnode.dev.simplerestapidemo.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import vtsen.hashnode.dev.simplerestapidemo.R
import vtsen.hashnode.dev.simplerestapidemo.data.MealCategory

@Composable
fun MealCategoryItem(
    mealCategory: MealCategory,
) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Text(text = mealCategory.name, style = MaterialTheme.typography.h4)

        Image(
            painter = rememberImagePainter(
                data = mealCategory.imageUrl,
                builder = {
                    placeholder(R.drawable.loading_animation)
                }
            ),

            contentDescription = "",
            modifier = Modifier
                .size(150.dp, 150.dp)
                .clip(MaterialTheme.shapes.medium)
        )

        Divider(thickness = 2.dp)
    }
}


