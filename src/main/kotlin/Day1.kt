fun main() {
    Day1.solution()
}

object Day1 {
    fun part1(input: String) = input.getCaloriesPerElf()
        .max()

    fun part2(input: String) = input.getCaloriesPerElf()
        .sortedDescending()
        .take(3)
        .sum()

    private fun String.getCaloriesPerElf(): List<Int> {
        return split("\n\n").map { elf ->
            elf.split("\n").sumOf { calories ->
                calories.toInt()
            }
        }
    }

    internal fun solution() {
        val input = readInputRaw("day1")
        println("Part 1: ${part1(input)}")
        println("Part 2: ${part2(input)}")
    }
}
