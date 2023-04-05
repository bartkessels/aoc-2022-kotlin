package aoc

class PartTwo(
    private val sanitizer: Sanitizer
) {
    fun getResult(): Int {
        val data = sanitizer.getItems()
        val points = data?.map {
            val strategyPoints = when(getMove(it.first, it.second)) {
                "A" -> 1    // Rock
                "B" -> 2    // Paper
                else -> 3   // Scissors
            }
            val roundOutcome = when(it.second) {
                "X" -> 0    // Lost
                "Y" -> 3    // Draw
                else -> 6   // Won
            }

            strategyPoints + roundOutcome
        }

        val totalRoundsOutcome = points?.sum()

        return totalRoundsOutcome ?: -1;
    }

    /**
     * Get the expected move based on the expected outcome and the opponents move
     *
     * @param opponentMove the move the opponent is going to make
     * @param expectedOutcome the outcome that is expected
     * @return our move
     */
    private fun getMove(opponentMove: String, expectedOutcome: String): String =
        when(expectedOutcome) {
            "X" -> when(opponentMove) { // Lost
                "A" -> "C"  // Opponent: Rock, own: Scissors
                "B" -> "A"  // Opponent: Paper, own: Rock
                else -> "B" // Opponent: Scissors, own: Paper
            } // Won
            "Y" -> opponentMove // Draw
            else -> when(opponentMove) { // Won
                "A" -> "B"  // Opponent: Rock, own: Paper
                "B" -> "C"  // Opponent: Paper, own: Scissors
                else -> "A" // Opponent: Scissors, own: Rock
            }
        }
}