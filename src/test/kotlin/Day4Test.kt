import org.junit.jupiter.api.Test

internal class Day4Test {

    @Test
    fun testPart1_withExample() {
        assert(Day4.part1(testList) == 2)
    }

    @Test
    fun testPart2_withExample() {
        assert(Day4.part2(testList) == 4)
    }

    private val testList = listOf(
        "2-4,6-8",
        "2-3,4-5",
        "5-7,7-9",
        "2-8,3-7",
        "6-6,4-6",
        "2-6,4-8"
    )
}
