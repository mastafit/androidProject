package com.example.foody

import com.example.foody.models.FoodJoke
import org.junit.Test
import org.junit.Assert.*

class FoodJokeTest {

    @Test
    fun test_createFoodJoke_isCorrect() {
        val joke = FoodJoke(
            text = "This is a joke"
        )

        assertEquals("This is a joke", joke.text)
    }
}
