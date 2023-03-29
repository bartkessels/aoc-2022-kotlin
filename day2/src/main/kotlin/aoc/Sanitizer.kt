package aoc

import java.net.URL

class Sanitizer(
    private val resource: URL?
) {
    fun getItems(): List<Pair<String, String>>? {
        return resource
            ?.readText()
            ?.split("\n")
            ?.map {
                it
                    .split(" ")
                    .zipWithNext()
                    .first()
            }
    }
}