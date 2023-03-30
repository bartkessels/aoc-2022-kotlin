package aoc

class PartOne(
    private val sanitizer: Sanitizer
) {
    fun getResult(): Int {
        val data = sanitizer.getItems()
        val points = data?.map {
            val strategyPoints = when(it.second) {
                "X" -> 1    // Rock
                "Y" -> 2    // Paper
                else -> 3   // Scissors
            }
            val roundOutcome = when(it) {
                // Lost
                Pair("A", "Z"),
                Pair("B", "X"),
                Pair("C", "Y") -> 0

                // Draw
                Pair("A", "X"),
                Pair("B", "Y"),
                Pair("C", "Z") -> 3

                // Won
                else -> 6
            }

            strategyPoints + roundOutcome
        }

        val totalRoundsOutcome = points?.sum()

        return totalRoundsOutcome ?: -1;
    }
}