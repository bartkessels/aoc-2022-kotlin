package aoc

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PartTwoTest {
    @Test
    fun testGetResult() {
        // Arrange
        val resource = PartOneTest::class.java.getResource("/input_part_two.txt")
        val sanitizer = Sanitizer(resource)
        val sut = PartTwo(sanitizer)
        val expectedPosition = 19

        // Act
        val result = sut.getFirstMessagePosition()

        // Assert
        assertEquals(expectedPosition, result)
    }

    @Test
    fun testGetResultsWithEmptyDataReturnsMinusOne() {
        // Arrange
        val resource = null
        val sanitizer = Sanitizer(resource)
        val sut = PartTwo(sanitizer)
        val expectedPosition = -1

        // Act
        val result = sut.getFirstMessagePosition()

        // Assert
        assertEquals(expectedPosition, result)
    }
}