package aoc

fun main() {
    val resource = {}::class.java.getResource("/input.txt")
    val sanitizer = Sanitizer(resource)

    // Part one
    val partOne = PartOne(sanitizer)
    println("Part one: ${partOne.getFirstMarkerPosition()}")

    // Part two
    val partTwo = PartTwo(sanitizer)
    println("Part two: ${partTwo.getFirstMessagePosition()}")
}