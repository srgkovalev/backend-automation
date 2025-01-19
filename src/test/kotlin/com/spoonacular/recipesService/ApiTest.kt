package com.spoonacular.recipesService

import com.spoonacular.BaseTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName

class ApiTest: BaseTest() {

    @Test
    @DisplayName("Get all recipes")
    fun `required params and type checking`() {
        val resp = cli.getResp()

        assertEquals(true, resp.offset == 0, "offset not equal 0")
        assertEquals( true, resp.number > 0,"number equal 0")
        assertEquals( true, resp.totalResults > 0,"totalResults equal 0")

        resp.results.forEach{ el ->
            assertEquals(true, el.id > 0, "id equal 0")
            assertEquals(true, el.title != "", "title is empty")
            assertEquals(true, el.image != "", "title is empty")
            assertEquals(true, el.imageType == "jpg", "title not equal jpg format")
        }
    }
}
