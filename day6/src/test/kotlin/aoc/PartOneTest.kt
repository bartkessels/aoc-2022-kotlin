package aoc

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PartOneTest {
    @Test
    fun testGetFirstMarkerPosition() {
        // Arrange
        val resource = PartOneTest::class.java.getResource("/input_part_one.txt")
        val sanitizer = Sanitizer(resource)
        val sut = PartOne(sanitizer)
        val expectedPosition = 5

        // Act
        val result = sut.getFirstMarkerPosition()

        // Assert
        assertEquals(expectedPosition, result)
    }

    @Test
    fun testGetResultsWithEmptyDataReturnsMinusOne() {
        // Arrange
        val resource = null
        val sanitizer = Sanitizer(resource)
        val sut = PartOne(sanitizer)
        val expectedPosition = -1

        // Act
        val result = sut.getFirstMarkerPosition()

        // Assert
        assertEquals(expectedPosition, result)
    }
}