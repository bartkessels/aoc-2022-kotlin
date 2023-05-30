package aoc

import java.net.URL

class Sanitizer(
    private val resource: URL?
) {
    fun getDatastreamBuffers(): String? =
        resource
            ?.readText()
            ?.trim()
}