import org.junit.jupiter.api.Test

internal class Day5Test {

    @Test
    fun testPart1_withExample() {
        assert(Day5.part1(testList) == "CMZ")
    }

    @Test
    fun testPart2_withExample() {
        assert(Day5.part2(testList) == "MCD")
    }

    private val testList = listOf(
        "    [D]    ",
        "[N] [C]    ",
        "[Z] [M] [P]",
        " 1   2   3",
        "",
        "move 1 from 2 to 1",
        "move 3 from 1 to 3",
        "move 2 from 2 to 1",
        "move 1 from 1 to 2"
    )
}
