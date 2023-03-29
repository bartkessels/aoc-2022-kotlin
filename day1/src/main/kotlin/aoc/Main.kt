package aoc

class Main {
    companion object {
        fun main() {
            val resource = Main::class.java.getResource("/input.txt")
            val sanitizer = Sanitizer(resource)

            // Part one
            val first = First(sanitizer)
            println("Part one: ${first.getResult()}")

            // Part two
            val second = Second(sanitizer)
            println("Part two: ${second.getResult()}")
        }
    }
}

fun main() {
    Main.main()
}