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
            Pair("vJrwpWtwJgWr", "hcsFMMfFFhFp"),
            Pair("jqHRNqRjqzjGDLGL", "rsFMfFZSrLrFZsSL"),
            Pair("PmmdzqPrV", "vPwwTWBwg"),
            Pair("wMqvLMZHhHMvwLH", "jbvcjnnSBnvTQFn"),
            Pair("ttgJtRGJ", "QctTZtZT"),
            Pair("CrZsJsPPZsGz", "wwsLwLmpwMDw")
        )

        // Act
        val result = sut.getItems()

        // Assert
        assertContentEquals(expectedItems, result)
    }
}