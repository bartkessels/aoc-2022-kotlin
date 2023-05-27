package aoc

import java.util.*

class PartTwo(
    val sanitizer: Sanitizer
) {
    fun getResult(): String {
        val stacks = sanitizer.getStacks()
        sanitizer.getInstructions()?.forEach {
            val noItemsToMove = it.first
            val stackToRetrieveItemIndex = it.second - 1
            val stackToStoreItemIndex = it.third - 1

            val stackToRetrieveItem = stacks.get(stackToRetrieveItemIndex)
            val stackToStoreItem = stacks.get(stackToStoreItemIndex)

            moveItem(noItemsToMove, stackToRetrieveItem, stackToStoreItem)
        }

        return stacks.joinToString("") {
            it.peek().toString()
        }
    }

    /***
     * Move a specific number of items from one stack to another and remove them from the
     * stack where the items are moved from.
     *
     * @param noItemsToMove the number of items to move
     * @param stackToRetrieveItem the stack where the items are moved from
     * @param stackToStoreItem the stack where the items are moved to
     */
    private fun moveItem(noItemsToMove: Int, stackToRetrieveItem: Stack<Char>, stackToStoreItem: Stack<Char>) {
        var items = ""

        for (i in 1..noItemsToMove) {
            items += stackToRetrieveItem.pop()
        }

        items.reversed().forEach {
            stackToStoreItem.push(it)
        }
    }
}