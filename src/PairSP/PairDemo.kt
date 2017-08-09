package PairSP


fun printPair(p: Pair<Int, Int>) {
    val (a, b) = p
    println("p: $p, p.first: ${p.first}, p.second: ${p.second}, (a, b): ($a, $b)")
}


fun main(args: Array<String>) {
    val p1 = Pair(1, 2)
    val p2 = 3 to 4
    printPair(p1)
    printPair(p2)
}
