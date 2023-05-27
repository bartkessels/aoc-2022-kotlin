package aoc

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PartTwoTest {
    @Test
    fun testGetResult() {
        // Arrange
        val resource = PartOneTest::class.java.getResource("/input.txt")
        val sanitizer = Sanitizer(resource)
        val sut = PartTwo(sanitizer)
        val expectedResult = "MCD"

        // Act
        val result = sut.getResult()

        // Assert
        assertEquals(expectedResult, result)
    }
}