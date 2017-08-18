package StringSP


fun stringSplit() {
    println("=== stringSplit ===")
    val s = "A;2017-08-16 11:06:42"
    val parts = s.split(";".toRegex())
    println(parts)
    val part1 = parts[0]
    val part2 = parts[1]
    println("part1: " + part1)
    println("part2: " + part2)
}


fun stringLength() {
    println("=== stringLength ===")
    val s = ""
    val s2 = "x"
    println("s.length: ${s.length}")
    println("s2.length: ${s2.length}")
}


fun stringToInt() {
    println("=== stringToInt ===")
    val s = "123"
    println("s.toInt(): ${s.toInt()}")
    // ref: https://stackoverflow.com/questions/19519468/how-to-convert-string-to-long-in-kotlin
}


fun main(args: Array<String>) {
    stringSplit()
    stringLength()
    stringToInt()
}
