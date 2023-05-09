package aoc

class PartOne(
    private val sanitizer: Sanitizer
) {
    fun getResult(): Int {
        val rangesThatOverlapCompletely = sanitizer
            .getItems()
            ?.filter {
                isRangeInsideAnother(it.first, it.second) ||
                isRangeInsideAnother(it.second, it.first)
            }
            ?.count()

        return rangesThatOverlapCompletely ?: -1
    }

    /***
     * Check if rangeB is completely inside rangeA
     *
     * @param rangeA the range that is used to check rangeB against
     * @param rangeB the range that is checked against rangeA
     */
    private fun isRangeInsideAnother(rangeA: Pair<Int, Int>, rangeB: Pair<Int, Int>): Boolean {
        val isStartInsideRangeA = rangeB.first >= rangeA.first && rangeB.first <= rangeA.second
        val isEndInsideRangeA = rangeB.second >= rangeA.first && rangeB.second <= rangeA.second

        return isStartInsideRangeA && isEndInsideRangeA
    }
}