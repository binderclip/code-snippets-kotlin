package StringSP

fun main(args: Array<String>) {
    val s = "A;2017-08-16 11:06:42"
    val parts = s.split(";".toRegex())
    println(parts)
    val part1 = parts[0]
    val part2 = parts[1]
    println("part1: " + part1)
    println("part2: " + part2)
}
