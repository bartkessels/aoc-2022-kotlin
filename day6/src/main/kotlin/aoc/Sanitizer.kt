package aoc

import java.net.URL

class Sanitizer(
    private val resource: URL?
) {
    /**
     * Read the data from the input
     *
     * @return The input text or null
     */
    fun getData(): List<String>? =
        resource
            ?.readText()
            ?.split("\n")
}