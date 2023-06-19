package com.example.foody

import com.example.foody.models.FoodRecipe
import com.example.foody.models.Result
import org.junit.Test
import org.junit.Assert.*

class FoodRecipeTest {

    @Test
    fun test_createFoodRecipe_isCorrect() {
        val results = listOf(
            Result(
                aggregateLikes = 123,
                cheap = true,
                dairyFree = false,
                extendedIngredients = listOf(),
                glutenFree = true,
                recipeId = 1,
                image = "imageUrl",
                readyInMinutes = 30,
                sourceName = "Source",
                sourceUrl = "SourceUrl",
                summary = "Summary",
                title = "Title",
                vegan = true,
                vegetarian = true,
                veryHealthy = true
            )
        )

        val foodRecipe = FoodRecipe(
            results = results
        )

        assertEquals(results, foodRecipe.results)
        assertEquals(1, foodRecipe.results.size)
        assertEquals("Title", foodRecipe.results[0].title)
    }
}
