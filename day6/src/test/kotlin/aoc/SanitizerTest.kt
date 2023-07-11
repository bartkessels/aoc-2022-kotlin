package aoc

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SanitizerTest {
    @Test
    fun testGetItems() {
        // Arrange
        val input = {}::class.java.getResource("/input_day_two.txt")
        val expectedData = "mjqjpqmgbljsphdztnvjfqwrcgsmlb"
        val sut = Sanitizer(input)

        // Act
        val actualData = sut.getDatastreamBuffers()

        // Assert
        assertEquals(expectedData, actualData)
    }
}
