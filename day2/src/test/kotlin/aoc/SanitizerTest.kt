package aoc

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class SanitizerTest {
    @Test
    fun testGetItems() {
        // Arrange
        val resource = {}::class.java.getResource("/input.txt")
        val sut = Sanitizer(resource)
        val expectedItems = listOf(
            Pair("A", "Y"),
            Pair("B", "X"),
            Pair("C", "Z")
        )

        // Act
        val result = sut.getItems()

        // Assert
        assertContentEquals(expectedItems, result)
    }
}