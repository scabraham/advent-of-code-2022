import org.junit.jupiter.api.Test

internal class Day3Test {

    @Test
    fun testPart1_withExample() {
        assert(Day3.part1(testList) == 157)
    }

    @Test
    fun testPart2_withExample() {
        assert(Day3.part2(testList) == 70)
    }

    private val testList = listOf(
        "vJrwpWtwJgWrhcsFMMfFFhFp",
        "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
        "PmmdzqPrVvPwwTWBwg",
        "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
        "ttgJtRGJQctTZtZT",
        "CrZsJsPPZsGzwwsLwLmpwMDw"
    )
}
