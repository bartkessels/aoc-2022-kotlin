package aoc

class PartOne(
    private val sanitizer: Sanitizer
) {
    fun getFirstMarkerPosition(): Int {
        val chunkSize = 4
        var currentIndex = -1
        var firstMarkerPosition = -1

        sanitizer.getDatastreamBuffers()?.windowed(chunkSize, step = 1, partialWindows = true) {
            currentIndex++

            if (it.toSet().size == chunkSize && firstMarkerPosition <= 0) {
                firstMarkerPosition = currentIndex + chunkSize
            }
        }

        return firstMarkerPosition
    }
}