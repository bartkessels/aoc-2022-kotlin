package aoc

class PartTwo(
    private val sanitizer: Sanitizer
) {
    fun getResult(): Int {
        val rangesThatOverlap = sanitizer
            .getItems()
            ?.filter {
                doesRangeOverlap(it.first, it.second) ||
                doesRangeOverlap(it.second, it.first)
            }
            ?.count()

        return rangesThatOverlap ?: -1
    }

    /***
     * Check if rangeB overlaps somewehere with rangeA
     *
     * @param rangeA the range that is used to check rangeB against
     * @param rangeB the range that is checked against rangeA
     */
    private fun doesRangeOverlap(rangeA: Pair<Int, Int>, rangeB: Pair<Int, Int>): Boolean {
        val isStartInsideRangeA = rangeB.first >= rangeA.first && rangeB.first <= rangeA.second
        val isEndInsideRangeA = rangeB.second >= rangeA.first && rangeB.second <= rangeA.second

        return isStartInsideRangeA || isEndInsideRangeA
    }
}