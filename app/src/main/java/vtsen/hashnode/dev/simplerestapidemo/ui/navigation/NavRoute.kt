package vtsen.hashnode.dev.simplerestapidemo.ui.navigation

sealed class NavRoute(val path: String) {

    object Home: NavRoute("home")

    object MealCategories: NavRoute("mealcategories")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(path)
            args.forEach{ arg ->
                append("/$arg")
            }
        }
    }

    fun withArgsFormat(vararg args: String) : String {
        return buildString {
            append(path)
            args.forEach{ arg ->
                append("/{$arg}")
            }
        }
    }
}