package aoc

import java.net.URL

class Sanitizer(
    private val resource: URL?
) {
    fun getItems(): List<Pair<String, String>>? =
        resource
            ?.readText()
            ?.split("\n")
            ?.map {
                val compartmentSize = it.length / 2
                val firstCompartment = it.substring(0, compartmentSize)
                val secondCompartment = it.substring(compartmentSize, it.length)

                Pair(firstCompartment, secondCompartment)
            }
}