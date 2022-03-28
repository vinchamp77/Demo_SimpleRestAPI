package vtsen.hashnode.dev.simplerestapidemo.repository.remote.ktorkotlinserdes

import io.ktor.client.*
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import vtsen.hashnode.dev.simplerestapidemo.data.KotlinSerdesMealCategoriesResponse
import vtsen.hashnode.dev.simplerestapidemo.repository.MainRepository

class KtorKotlinSerdesMealsWebService {

    private val ktorHttpClient = HttpClient {
        install(JsonFeature) {
            serializer = KotlinxSerializer()
        }
    }

    suspend fun getMealCategories(): KotlinSerdesMealCategoriesResponse {
        return ktorHttpClient.get("${MainRepository.BASE_URL}categories.php")
    }
}