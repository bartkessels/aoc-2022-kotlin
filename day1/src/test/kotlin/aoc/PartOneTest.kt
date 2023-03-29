package aoc

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PartOneTest {
    @Test
    fun testGetResult() {
        // Arrange
        val resource = PartOneTest::class.java.getResource("/input.txt")
        val sanitizer = Sanitizer(resource)
        val sut = PartOne(sanitizer)
        val expectedCalories = 24000

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
        val sut = PartOne(sanitizer)
        val expectedCalories = -1

        // Act
        val result = sut.getResult()

        // Assert
        assertEquals(expectedCalories, result)
    }
}