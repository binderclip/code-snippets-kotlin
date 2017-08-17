package ListSP

fun listBasicOp() {
    println("=== listBasicOp ===")
    var myList : MutableList<Int> = mutableListOf(1, 2, 3)
    myList.add(4)
    myList.addAll(listOf(5, 6))
    println(myList)
    println(myList.size)
    println(myList.count())     // 返回的就是 size
}


fun listSort() {
    println("=== listSort ===")
    val l1 = listOf(Pair("a", 2), Pair("c", 1), Pair("b", 3))
    println("l1: $l1")
    val l2 = l1.sortedBy { it.first }
    println("l2: $l2")
    val l3 = l1.sortedBy { it.second }
    println("l3: $l3")
    val l4 = l1.sortedByDescending { it.second }
    println("l4: $l4")

    val ml = mutableListOf(Pair("a", 2), Pair("c", 1), Pair("b", 3))
    println("ml: $ml")
    ml.sortBy { it.first }
    println("ml: $ml")
    ml.sortBy { it.second }
    println("ml: $ml")
    ml.sortByDescending { it.second }
    println("ml: $ml")
}


fun main(args: Array<String>) {
    listBasicOp()
    listSort()
}
