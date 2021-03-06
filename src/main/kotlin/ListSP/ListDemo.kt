package ListSP


fun initList() {
    println("=== initList ===")
    val myList = listOf(1, 2, 3)
    val myMList = mutableListOf(4, 5, 6)
    println(myList)
    println(myMList)
}


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


fun listCombination() {
    println("=== listCombination ===")
    val l1 = listOf(1, 2, 3)
    val l2 = listOf(4, 5, 6)
    val l3 = l1 + l2
    println("l1: $l1")
    println("l2: $l2")
    println("l3: $l3")
}


fun listWithIndex() {
    println("=== listWithIndex ===")
    val l1 = listOf("a", "b", "c")
    val i1 = l1.withIndex()  // Iterable<IndexedValue<T>>
    println("l1: $l1")
    print("i1:")
    // for
    for (indexedValue in i1) {
        print(" ${indexedValue.index}:${indexedValue.value}")
    }
    println()
    print("i1:")
    // map
    i1.map { print(" ${it.index}:${it.value}") }
    println()
}


fun main(args: Array<String>) {
    initList()
    listBasicOp()
    listSort()
    listCombination()
    listWithIndex()
}
