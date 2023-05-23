package aoc

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SanitizerTest {
    @Test
    fun testGetItems() {
        // Arrange
        val input = {}::class.java.getResource("/input.txt")
        val expectedData = "mjqjpqmgbljsphdztnvjfqwrcgsmlb"
        val sut = Sanitizer(input)

        // Act
        val actualData = sut.getData()

        // Assert
        assertEquals(expectedData, actualData)
    }
}