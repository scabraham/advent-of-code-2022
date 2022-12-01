import java.io.File

fun readInput(name: String) = File("src/main/resources", "$name.txt").readLines()

fun readInputRaw(name: String) = File("src/main/resources", "$name.txt").readText()