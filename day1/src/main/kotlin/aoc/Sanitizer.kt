package aoc

import java.net.URL

class Sanitizer(
    private val resource: URL?
) {
    fun getItems(): List<List<Int>>? {
        return resource
            ?.readText()
            ?.split("\n\n")
            ?.map {
                it.split("\n").map{ it.toInt() }
            }
    }
}