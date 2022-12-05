fun main() {
    Day3.solution()
}

object Day3 {
    fun part1(input: List<String>) = input.sumOf { rucksack ->
        rucksack.chunked(rucksack.length / 2)
            .getCommonItemValue()
    }

    fun part2(input: List<String>) = input.chunked(3)
        .sumOf { it.getCommonItemValue() }

    private fun List<String>.getCommonItemValue(): Int {
        return (map { it.toSet() }
            .reduce { x, y -> x intersect y }
            .first()
            .let { if (it.isLowerCase()) it - 'a' + 1 else it - 'A' + 27 })
    }

    internal fun solution() {
        val input = readInput("day3")
        println("Part 1: ${part1(input)}")
        println("Part 2: ${part2(input)}")
    }
}
