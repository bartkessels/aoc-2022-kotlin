package aoc

import java.net.URL
import java.util.Stack

class Sanitizer(
    private val resource: URL?
) {
    fun getStacks(): List<Stack<Char>> {
        val stacks = mutableListOf<Stack<Char>>()
        val stackCharacterSize = 4

        resource
            ?.readText()
            ?.split("\n\n")
            ?.first()
            ?.split("\n")
            ?.forEach {
                var currentStackIndex = 0

                it.chunked(stackCharacterSize) {
                    val character = it
                        .removePrefix("[")
                        .removeSuffix("]")
                        .trim()
                        .first()

                    if (stacks.elementAtOrNull(currentStackIndex) == null) {
                        stacks.add(currentStackIndex, Stack<Char>())
                    }

                    stacks.elementAt(currentStackIndex).push(character)
                    currentStackIndex++
                }
            }

        return stacks
    }

    fun getInstructions(): List<Triple<Int, Int, Int>> {
        resource
            ?.readText()
            ?.split("\n\n")
            ?.last()
            ?.split("\n")
            ?.map {
                it
                    .replace("move ", "")
                    .replace("from ", "")
                    .replace("to ", "")
                    .split(" ")
                    .map{ it.toInt() }
            }
    }
}