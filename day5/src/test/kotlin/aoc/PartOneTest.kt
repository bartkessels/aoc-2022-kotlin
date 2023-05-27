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
        val expectedResult = "CMZ"

        // Act
        val result = sut.getResult()

        // Assert
        assertEquals(expectedResult, result)
    }
}