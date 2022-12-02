import org.junit.jupiter.api.Test

internal class Day2Test {

    @Test
    fun testPart1_withExample() {
        assert(Day2.part1(testList) == 15)
    }

    @Test
    fun testPart2_withExample() {
        assert(Day2.part2(testList) == 12)
    }

    private val testList = listOf(
        "A Y",
        "B X",
        "C Z"
    )
}