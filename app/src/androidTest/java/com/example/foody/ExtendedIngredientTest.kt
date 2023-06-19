package com.example.foody

import com.example.foody.models.ExtendedIngredient
import org.junit.Test
import org.assertj.core.api.Assertions.assertThat

class ExtendedIngredientTest {
    @Test
    fun testExtendedIngredient() {
        val ingredient = ExtendedIngredient(
            amount = 1.0,
            consistency = "solid",
            image = "testImage",
            name = "testIngredient",
            original = "testOriginal",
            unit = "kg"
        )

        assertThat(ingredient.amount).isEqualTo(1.0)
        assertThat(ingredient.consistency).isEqualTo("solid")
        assertThat(ingredient.image).isEqualTo("testImage")
        assertThat(ingredient.name).isEqualTo("testIngredient")
        assertThat(ingredient.original).isEqualTo("testOriginal")
        assertThat(ingredient.unit).isEqualTo("kg")
    }
}
