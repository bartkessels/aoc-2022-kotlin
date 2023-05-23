package aoc

import org.junit.jupiter.api.Test
import java.util.*
import kotlin.test.assertContentEquals

class SanitizerTest {
    @Test
    fun testGetStacks() {
        // Arrange
        val resource = SanitizerTest::class.java.getResource("/input.txt")
        val sut = Sanitizer(resource)
        val expectedStack1 = Stack<Char>()
        val expectedStack2 = Stack<Char>()
        val expectedStack3 = Stack<Char>()

        expectedStack1.push('N')
        expectedStack1.push('Z')
        expectedStack2.push('D')
        expectedStack2.push('C')
        expectedStack2.push('M')
        expectedStack3.push('P')

        val expectedStacks = listOf(
            expectedStack1,
            expectedStack2,
            expectedStack3
        )

        // Act
        val result = sut.getStacks()

        // Assert
        assertContentEquals(expectedStacks, result)
    }

    @Test
    fun testGetInstructions() {
        // Arrange
        val resource = SanitizerTest::class.java.getResource("/input.txt")
        val sut = Sanitizer(resource)
        val expectedInstructions = listOf(
            Triple(1, 2, 1),
            Triple(3, 1, 3),
            Triple(2, 2, 1),
            Triple(1, 1, 2)
        )

        // Act
        val result = sut.getInstructions()

        // Assert
        assertContentEquals(expectedInstructions, result)
    }
}