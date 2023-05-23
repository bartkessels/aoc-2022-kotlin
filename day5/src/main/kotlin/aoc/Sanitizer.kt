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
            ?.dropLast(1)
            ?.forEach {
                var currentStackIndex = 0

                it.chunked(stackCharacterSize) {
                    val character = it
                        .removePrefix("[")
                        .removeSuffix("]")
                        .trim()
                        .firstOrNull()

                    if (stacks.elementAtOrNull(currentStackIndex) == null) {
                        stacks.add(currentStackIndex, Stack<Char>())
                    }

                    character?.let {
                        stacks.elementAt(currentStackIndex).push(it)
                    }

                    currentStackIndex++
                }
            }

        return stacks
    }

    fun getInstructions(): List<Triple<Int, Int, Int>>? =
        resource
            ?.readText()
            ?.split("\n\n")
            ?.last()
            ?.split("\n")
            ?.map {
                val items = it
                    .replace("move ", "")
                    .replace("from ", "")
                    .replace("to ", "")
                    .split(" ")
                    .map{ it.toInt() }
                    .take(3)

                Triple(
                    items.get(0),
                    items.get(1),
                    items.get(2)
                )
            }
}