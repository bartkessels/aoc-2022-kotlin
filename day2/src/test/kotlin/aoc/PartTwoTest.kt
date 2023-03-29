package aoc

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PartTwoTest {
    @Test
    fun testGetResult() {
        // Arrange
        val resource = PartTwoTest::class.java.getResource("/input.txt")
        val sanitizer = Sanitizer(resource)
        val sut = PartTwo(sanitizer)
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
        val sut = PartTwo(sanitizer)
        val expectedCalories = -1

        // Act
        val result = sut.getResult()

        // Assert
        assertEquals(expectedCalories, result)
    }
}