package aoc

import java.lang.Integer.min

class PartTwo(
    private val sanitizer: Sanitizer
) {
    fun getResult(): Int {
        val result = sanitizer.getItems()?.map {
            "${it.first}${it.second}"
        }?.chunked(3) {
            val rucksackA = it[0]
            val rucksackB = it[1]
            val rucksackC = it[2]

            findMatchingCharacter(rucksackA, rucksackB, rucksackC)
        }?.sumOf {
            getPriority(it)
        }

        return result ?: -1
    }

    /**
     * Find the first character in rucksack A that also
     * present in rucksacks B and C
     *
     * @param rucksackA the first rucksack
     * @param rucksackB the second rucksack
     * @param rucksackC the last rucksack
     * @return the character that is present in all three
     *         rucksacks or an empty char
     */
    private fun findMatchingCharacter(rucksackA: String, rucksackB: String, rucksackC: String): Char {
        if (rucksackA.length > min(rucksackB.length, rucksackC.length)) {
            return findMatchingCharacter(rucksackB, rucksackC, rucksackA)
        }

        rucksackA.forEach {
            if (rucksackB.contains(it) && rucksackC.contains(it)) {
                return it
            }
        }

        return Char.MIN_VALUE
    }

    /**
     * Find the first character in rucksack A that also
     * present in rucksacks B and C
     *
     * @param rucksackA the first rucksack
     * @param rucksackB the second rucksack
     * @param rucksackC the last rucksack
     * @return the character that is present in all three
     *         rucksacks or an empty char
     */
    private fun findMatchingCharacterUnoptimized(rucksackA: String, rucksackB: String, rucksackC: String): Char {
        rucksackA.forEach {
            if (rucksackB.contains(it) && rucksackC.contains(it)) {
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