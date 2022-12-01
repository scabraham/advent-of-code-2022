import org.junit.jupiter.api.Test

internal class Day1Test {

    @Test
    fun testPart1_withExample() {
        assert(Day1.part1(testInput) == 24000)
    }

    @Test
    fun testPart2_withExample() {
        assert(Day1.part2(testInput) == 45000)
    }

    private val testInput = "1000\n2000\n3000\n\n4000\n\n5000\n6000\n\n7000\n8000\n9000\n\n10000"
}