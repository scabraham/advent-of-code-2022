fun main() {
    Day2.solution()
}

object Day2 {
    fun part1(input: List<String>): Int {
        return input.sumOf { round ->
            val (opShape, plShape) = round.split(" ")
            val opValue = opShape.value()
            val plValue = plShape.value()
            plValue.resultScore(opValue) + plValue
        }
    }

    fun part2(input: List<String>): Int {
        return input.sumOf { round ->
            val (opShape, result) = round.split(" ")
            val opValue = opShape.value()
            val rsValue = result.value()
            val plValue = rsValue.toPlayerValue(opValue)
            val rsScore = (rsValue - 1) * 3
            plValue + rsScore
        }
    }

    private fun String.value() = when (this) { "A", "X" -> 1; "B", "Y" -> 2; "C", "Z" -> 3; else -> 0 }

    private fun Int.resultScore(opValue: Int) = (this - opValue + 1).mod(3) * 3

    private fun Int.toPlayerValue(opValue: Int) = (opValue + this).mod(3) + 1

    internal fun solution() {
        val input = readInput("day2")
        println("Part 1: ${part1(input)}")
        println("Part 2: ${part2(input)}")
    }
}
