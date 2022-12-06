import org.junit.jupiter.api.Test

internal class Day6Test {

    @Test
    fun testPart1_withExample() {
        assert(Day6.part1("mjqjpqmgbljsphdztnvjfqwrcgsmlb") == 7)
        assert(Day6.part1("bvwbjplbgvbhsrlpgdmjqwftvncz") == 5)
        assert(Day6.part1("nppdvjthqldpwncqszvftbrmjlhg") == 6)
        assert(Day6.part1("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg") == 10)
        assert(Day6.part1("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw") == 11)
    }

    @Test
    fun testPart2_withExample() {
        assert(Day6.part2("mjqjpqmgbljsphdztnvjfqwrcgsmlb") == 19)
        assert(Day6.part2("bvwbjplbgvbhsrlpgdmjqwftvncz") == 23)
        assert(Day6.part2("nppdvjthqldpwncqszvftbrmjlhg") == 23)
        assert(Day6.part2("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg") == 29)
        assert(Day6.part2("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw") == 26)
    }
}