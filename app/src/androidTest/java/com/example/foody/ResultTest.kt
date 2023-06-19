package com.example.foody

import com.example.foody.models.ExtendedIngredient
import com.example.foody.models.Result
import org.junit.Test
import org.junit.Assert.*

class ResultTest {

    @Test
    fun test_createResult_isCorrect() {
        val extendedIngredients = listOf(
            ExtendedIngredient(
                amount = 1.0,
                consistency = "solid",
                image = "image",
                name = "ingredient",
                original = "original",
                unit = "kg"
            )
        )

        val result = Result(
            aggregateLikes = 123,
            cheap = true,
            dairyFree = false,
            extendedIngredients = extendedIngredients,
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

        assertEquals(123, result.aggregateLikes)
        assertTrue(result.cheap)
        assertFalse(result.dairyFree)
        assertEquals(extendedIngredients, result.extendedIngredients)
        assertTrue(result.glutenFree)
        assertEquals(1, result.recipeId)
        assertEquals("imageUrl", result.image)
        assertEquals(30, result.readyInMinutes)
        assertEquals("Source", result.sourceName)
        assertEquals("SourceUrl", result.sourceUrl)
        assertEquals("Summary", result.summary)
        assertEquals("Title", result.title)
        assertTrue(result.vegan)
        assertTrue(result.vegetarian)
        assertTrue(result.veryHealthy)
    }
}
