package com.example.android.wearable.composeforwearos

data class WidgetUiModel(
    val weeks: List<WeekUiModel>
)

data class WeekUiModel(
    val date: Long,
    val deliveryStatus: String,
    val deliveryStatusSubtitle: String?,
    val action: String?,
    val recipes: List<RecipeUiModel>
)

data class RecipeUiModel(
    val title: String,
    val imageUrl: String,
    val description: String = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes"
)

object WidgetData {

    val FakeData = WidgetUiModel(
        weeks = listOf(
            WeekUiModel(
                date = 1660826787906,
                deliveryStatus = "On the way!",
                deliveryStatusSubtitle = "Arrives today",
                action = null,
                recipes = listOf(
                    RecipeUiModel(
                        title = "Turkey-Shrimp Jambalaya",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/crispy-kickin-cayenne-chicken-cutlets-2f90c9c6.jpg"
                    ),
                    RecipeUiModel(
                        title = "Chicken-Pasta Salad",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/6283af7cbdf45d9c590e234c-eba39f47.jpg"
                    ),
                    RecipeUiModel(
                        title = "Beef and Red Onion Bake",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/6283afcdbf09ac49500c2cf2-0faf47d3.jpg"
                    ),
                    RecipeUiModel(
                        title = "Wild Rice and Bulgur Pilaf",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/summer-bbq-chicken-plates-3a9ac91a.jpg"
                    ),
                    RecipeUiModel(
                        title = "Beef-Olive Turnovers",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/ginger-ponzu-turkey-patties-a736222c.jpg"
                    )
                )
            ),
            WeekUiModel(
                date = 1656367200000,
                deliveryStatus = "Coming up",
                deliveryStatusSubtitle = "Edit delivery by Friday June 24",
                action = "Select",
                recipes = listOf(
                    RecipeUiModel(
                        title = "Recipe",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/crispy-kickin-cayenne-chicken-cutlets-2f90c9c6.jpg"
                    ),
                    RecipeUiModel(
                        title = "Recipe",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/6283af7cbdf45d9c590e234c-eba39f47.jpg"
                    ),
                    RecipeUiModel(
                        title = "Recipe",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/6283afcdbf09ac49500c2cf2-0faf47d3.jpg"
                    ),
                    RecipeUiModel(
                        title = "Recipe",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/summer-bbq-chicken-plates-3a9ac91a.jpg"
                    ),
                    RecipeUiModel(
                        title = "Recipe",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/ginger-ponzu-turkey-patties-a736222c.jpg"
                    ),
                    RecipeUiModel(
                        title = "Recipe",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/white-cheddar-ranch-chicken-penne-07a163cf.jpg"
                    )
                )
            ),
            WeekUiModel(
                date = 1656972000000,
                deliveryStatus = "Coming up",
                deliveryStatusSubtitle = "Edit delivery by Friday June 24",
                action = "Select",
                recipes = listOf(
                    RecipeUiModel(
                        title = "Recipe",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/crispy-kickin-cayenne-chicken-cutlets-2f90c9c6.jpg"
                    ),
                    RecipeUiModel(
                        title = "Recipe",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/6283af7cbdf45d9c590e234c-eba39f47.jpg"
                    ),
                    RecipeUiModel(
                        title = "Recipe",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/6283afcdbf09ac49500c2cf2-0faf47d3.jpg"
                    ),
                    RecipeUiModel(
                        title = "Recipe",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/summer-bbq-chicken-plates-3a9ac91a.jpg"
                    ),
                    RecipeUiModel(
                        title = "Recipe",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/ginger-ponzu-turkey-patties-a736222c.jpg"
                    ),
                    RecipeUiModel(
                        title = "Recipe",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/white-cheddar-ranch-chicken-penne-07a163cf.jpg"
                    )
                )
            ),
            WeekUiModel(
                date = 1657576800000,
                deliveryStatus = "Coming up",
                deliveryStatusSubtitle = "Edit delivery by Friday July 1",
                action = "Select",
                recipes = listOf(
                    RecipeUiModel(
                        title = "Recipe",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/crispy-kickin-cayenne-chicken-cutlets-2f90c9c6.jpg"
                    ),
                    RecipeUiModel(
                        title = "Recipe",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/6283af7cbdf45d9c590e234c-eba39f47.jpg"
                    )
                )

            ),
            WeekUiModel(
                date = 1658181600000,
                deliveryStatus = "Coming up",
                deliveryStatusSubtitle = "Edit delivery by Friday July 8",
                action = "Select",
                recipes = listOf(
                    RecipeUiModel(
                        title = "Recipe",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/crispy-kickin-cayenne-chicken-cutlets-2f90c9c6.jpg"
                    ),
                    RecipeUiModel(
                        title = "Recipe",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/6283af7cbdf45d9c590e234c-eba39f47.jpg"
                    ),
                    RecipeUiModel(
                        title = "Recipe",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/6283afcdbf09ac49500c2cf2-0faf47d3.jpg"
                    )
                )

            ),
            WeekUiModel(
                date = 1658786400000,
                deliveryStatus = "Coming up",
                deliveryStatusSubtitle = "Edit delivery by Friday July 18",
                action = "Select",
                recipes = listOf(
                    RecipeUiModel(
                        title = "Recipe",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/crispy-kickin-cayenne-chicken-cutlets-2f90c9c6.jpg"
                    ),
                    RecipeUiModel(
                        title = "Recipe",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/6283af7cbdf45d9c590e234c-eba39f47.jpg"
                    ),
                    RecipeUiModel(
                        title = "Recipe",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/6283afcdbf09ac49500c2cf2-0faf47d3.jpg"
                    ),
                    RecipeUiModel(
                        title = "Recipe",
                        imageUrl = "https://img.hellofresh.com/q_auto/recipes/image/summer-bbq-chicken-plates-3a9ac91a.jpg"
                    )
                )
            )
        )
    )
}