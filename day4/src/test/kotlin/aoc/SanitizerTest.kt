package aoc

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class SanitizerTest {
    @Test
    fun testGetItems() {
        // Arrange
        val resource = SanitizerTest::class.java.getResource("/input.txt")
        val sut = Sanitizer(resource)
        val expectedItems = listOf(
            Pair(
                Pair(2, 4),
                Pair(6, 8)
            ),
            Pair(
                Pair(2, 3),
                Pair(4, 5)
            ),
            Pair(
                Pair(5, 7),
                Pair(7, 9)
            ),
            Pair(
                Pair(2, 8),
                Pair(3, 7)
            ),
            Pair(
                Pair(6, 6),
                Pair(4, 6)
            ),
            Pair(
                Pair(2, 6),
                Pair(4, 8)
            )
        )

        // Act
        val result = sut.getItems()

        // Assert
        assertContentEquals(expectedItems, result)
    }
}