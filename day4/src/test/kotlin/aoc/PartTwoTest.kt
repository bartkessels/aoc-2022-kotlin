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
        val expectedNumberOfOverlappingPairs = 4

        // Act
        val result = sut.getResult()

        // Assert
        assertEquals(expectedNumberOfOverlappingPairs, result)
    }

    @Test
    fun testGetResultsWithEmptyDataReturnsMinusOne() {
        // Arrange
        val resource = null
        val sanitizer = Sanitizer(resource)
        val sut = PartTwo(sanitizer)
        val expectedNumberOfOverlappingPairs = -1

        // Act
        val result = sut.getResult()

        // Assert
        assertEquals(expectedNumberOfOverlappingPairs, result)
    }
}