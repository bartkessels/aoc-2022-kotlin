package aoc

class Second(
    private val sanitizer: Sanitizer
) {
    fun getResult(): Int {
        val data = sanitizer.getItems()
        val totalCalories = data?.map { it.sum() }
        val sortedCalories = totalCalories?.sortedDescending()
        val topThreeMostCalories = sortedCalories?.subList(
            fromIndex = 0,
            toIndex = 3 // toIndex is three instead of two because it's exclusive
        )
        val mostCalories = topThreeMostCalories?.sum()

        return mostCalories ?: -1
    }
}