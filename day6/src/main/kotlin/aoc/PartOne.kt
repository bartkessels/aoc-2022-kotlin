package aoc

class PartOne(
    private val sanitizer: Sanitizer
) {
    fun getFirstMarkerPosition(): Int {
        val chunkSize = 4
        var currentIndex = -1
        var firstMarkerPosition = -1

        sanitizer.getDatastreamBuffers()?.windowed(chunkSize, 1, true) {
            currentIndex++

            if (it.toSet().size == chunkSize && firstMarkerPosition <= 0) {
                firstMarkerPosition = currentIndex + chunkSize
                return@windowed
            }
        }

        return firstMarkerPosition
    }
}