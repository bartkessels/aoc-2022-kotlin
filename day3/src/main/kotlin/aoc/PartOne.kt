package aoc

class PartOne(
    private val sanitizer: Sanitizer
) {
    fun getResult(): Int {
        val result = sanitizer.getItems()
            ?.map {
                findMatchingCharacter(it.first, it.second)
            }?.sumOf {
                getPriority(it)
            }

        return result ?: -1
    }

    /**
     * Find the first character in compartment A that is also
     * present in compartment B
     *
     * @param compA the first compartment of the rucksack
     * @param compB the second compartment of the rucksack
     * @return the character that is present in both compartments
     *         or an empty char
     */
    private fun findMatchingCharacter(compA: String, compB: String): Char {
        compA.forEach {
            if (compB.contains(it)) {
                return it
            }
        }

        return Char.MIN_VALUE
    }

    /**
     * Get the priority of a character based on the following information
     *
     * Lowercase item types a through z have priorities 1 through 26.
     * Uppercase item types A through Z have priorities 27 through 52.
     *
     * @param character the character for which to get the property
     * @return the priority of the given character
     */
    private fun getPriority(character: Char): Int {
        val priorityAlphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
        return priorityAlphabet.indexOf(character) + 1
    }
}