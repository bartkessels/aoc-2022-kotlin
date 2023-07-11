package aoc

class PartTwo(
    private val sanitizer: Sanitizer
) {
    fun getFirstMessagePosition(): Int {
        val chunkSize = 14
        var currentIndex = -1
        var firstMarkerPosition = -1

        sanitizer.getDatastreamBuffers()?.windowed(size = chunkSize, step = 1, partialWindows = true) {
            currentIndex++

            if (it.toSet().size == chunkSize && firstMarkerPosition <= 0) {
                firstMarkerPosition = currentIndex + chunkSize
            }
        }

        return firstMarkerPosition
    }
}