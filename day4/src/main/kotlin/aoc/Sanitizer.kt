package aoc

import java.net.URL

class Sanitizer(
    private val resource: URL?
) {
    fun getItems(): List<Pair<Pair<Int, Int>, Pair<Int, Int>>>? =
        resource
            ?.readText()
            ?.split("\n")
            ?.map {
                val ranges = it.split(",")
                Pair(ranges[0], ranges[1])
            }
            ?.map {
                val firstElveRanges = it.first.split("-")
                val secondElveRanges = it.second.split("-")

                Pair(
                    Pair(firstElveRanges[0].toInt(), firstElveRanges[1].toInt()),
                    Pair(secondElveRanges[0].toInt(), secondElveRanges[1].toInt())
                )
            }
}