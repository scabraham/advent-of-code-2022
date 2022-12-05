fun main() {
    Day4.solution()
}

object Day4 {
    fun part1(input: List<String>) = input.map {
        it.split(',').map { range ->
            val (x, y) = range.split("-")
            IntRange(x.toInt(), y.toInt())
        }.hasFullyContained()
    }.count { it }

    fun part2(input: List<String>) = input.map { assignments ->
        assignments.split(',').map { range ->
            val (x, y) = range.split("-")
            IntRange(x.toInt(), y.toInt())
        }.hasPartiallyContained()
    }.count { it }

    private fun List<IntRange>.hasFullyContained() = (this[0] - this[1]).isEmpty() || (this[1] - this[0]).isEmpty()
    private fun List<IntRange>.hasPartiallyContained() = (this[0] intersect this[1]).isNotEmpty()

    internal fun solution() {
        val input = readInput("day4")
        println("Part 1: ${part1(input)}")
        println("Part 2: ${part2(input)}")
    }
}
