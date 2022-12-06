fun main() {
    Day6.solution()
}

object Day6 {
    fun part1(input: String) = getMarker(input, 4)

    fun part2(input: String) = getMarker(input, 14)

    private fun getMarker(message: String, size: Int) =
        message.windowed(size).indexOfFirst { it.toSet().size == size } + size

    internal fun solution() {
        val input = readInputRaw("day6")
        println("Part 1: ${part1(input)}")
        println("Part 2: ${part2(input)}")
    }
}
