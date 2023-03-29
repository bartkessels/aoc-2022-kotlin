package aoc

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SecondTest {
    @Test
    fun testGetResult() {
        // Arrange
        val resource = SecondTest::class.java.getResource("/input.txt")
        val sanitizer = Sanitizer(resource)
        val sut = Second(sanitizer)
        val expectedCalories = 45000

        // Act
        val result = sut.getResult()

        // Assert
        assertEquals(expectedCalories, result)
    }

    @Test
    fun testGetResultsWithEmptyDataReturnsMinusOne() {
        // Arrange
        val resource = null
        val sanitizer = Sanitizer(resource)
        val sut = Second(sanitizer)
        val expectedCalories = -1

        // Act
        val result = sut.getResult()

        // Assert
        assertEquals(expectedCalories, result)
    }
}