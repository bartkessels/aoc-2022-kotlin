package aoc

class First(
    private val sanitizer: Sanitizer
) {
    fun getResult(): Int {
        val data = sanitizer.getItems()
        val totalCalories = data?.map { it.sum() }
        val mostCalories = totalCalories?.maxOrNull()

        return mostCalories ?: -1
    }
}