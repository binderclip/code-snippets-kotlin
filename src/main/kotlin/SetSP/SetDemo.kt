package SetSP


fun main(args: Array<String>) {
    val set = setOf(1, 2, 3, 1)
    println(set)

    val pairList = listOf(Pair("a", 1), Pair("b", 1), Pair("b", 2))
    val set2 = HashSet(pairList.map { it.first })
    val set3 = HashSet(pairList.map { it.second })
    println(set2)
    println(set3)
    println(set2.toList())
    println(set3.toList())
}
