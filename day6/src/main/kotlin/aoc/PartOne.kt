package aoc

class PartOne(
    private val sanitizer: Sanitizer
) {
    fun getFirstMarkerPosition(): List<Int>? {
        val chunkSize = 4

        return sanitizer.getData()
            ?.map { sequence ->
                sequence.windowed(chunkSize, chunkSize) {

                }

                var currentIndex = -1

                sequence.chunked(chunkSize) {
                    currentIndex += chunkSize

                    if (it.toSet().size == chunkSize) {
                        // Return the currentIndex
                        currentIndex
                    }
                }

                currentIndex
            }
    }
}