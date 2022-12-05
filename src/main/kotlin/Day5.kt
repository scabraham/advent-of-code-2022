import java.util.*

fun main() {
    Day5.solution()
}

object Day5 {
    fun part1(input: List<String>): String {
        val stacks = input.takeWhile { it.isNotEmpty() }
            .dropLast(1)
            .mapToStacks()

        val instructions = input.dropWhile { it.isNotEmpty() }
            .drop(1)
            .map {
                val (quantity, stackFrom, stackTo) = regex.find(it)!!.destructured
                Instruction(quantity, stackFrom, stackTo)
            }
        return moveCrate(0, instructions, stacks)
    }

    fun part2(input: List<String>): String {
        val stacks = input.takeWhile { it.isNotEmpty() }
            .dropLast(1)
            .mapToStacks()

        val instructions = input.dropWhile { it.isNotEmpty() }
            .drop(1)
            .map {
                val (quantity, stackFrom, stackTo) = regex.find(it)!!.destructured
                Instruction(quantity, stackFrom, stackTo)
            }
        return moveCrateInMultiples(0, instructions, stacks)
    }

    //TODO: Find something better than the java Stack for this...
    private fun moveCrate(pointer: Int, instructions: List<Instruction>, stacks: List<Stack<Char>>): String {
        if (pointer == instructions.size) return stacks.map { it.peek() }
            .toCharArray()
            .concatToString()

        val instruction = instructions[pointer]
        (0 until instruction.quantity).forEach { _ ->
            stacks[instruction.stackTo - 1].push( stacks[instruction.stackFrom - 1].pop() )
        }
        return moveCrate(pointer + 1, instructions, stacks)
    }

    private fun moveCrateInMultiples(pointer: Int, instructions: List<Instruction>, stacks: List<Stack<Char>>): String {
        if (pointer == instructions.size) return stacks.map { it.peek() }
            .toCharArray()
            .concatToString()
        val instruction = instructions[pointer]
        stacks[instruction.stackTo - 1].addAll(stacks[instruction.stackFrom - 1].takeLast(instruction.quantity))
        repeat((0 until instruction.quantity).count()) { stacks[instruction.stackFrom - 1].removeLast() }
        return moveCrateInMultiples(pointer + 1, instructions, stacks)
    }

    private fun List<String>.mapToStacks(): List<Stack<Char>> {
        val lineLength = this[size - 1].length
        val noOfStacks = lineLength / 4 + 1
        val stacks = List<Stack<Char>>(noOfStacks) { Stack() }
        reversed().forEach { line ->
            (1..noOfStacks).map {
                line.padEnd(lineLength, ' ')
                    .toCharArray()[it * 4 - 3]
            }.forEachIndexed { index, crate ->
                if (crate != ' ') stacks[index].push(crate)
            }
        }
        return stacks
    }

    private val regex = Regex("move ([0-9]+) from ([0-9]+) to ([0-9]+)")

    private data class Instruction(
        val quantity: Int,
        val stackFrom: Int,
        val stackTo: Int
    ) {
        constructor(quantity: String, stackFrom: String, stackTo: String) : this(
            quantity.toInt(),
            stackFrom.toInt(),
            stackTo.toInt()
        )
    }

    internal fun solution() {
        val input = readInput("day5")
        println("Part 1: ${part1(input)}")
        println("Part 2: ${part2(input)}")
    }
}
