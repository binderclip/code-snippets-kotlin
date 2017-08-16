package ControlFlowSP

fun main(args: Array<String>) {
    var myList : MutableList<Int> = mutableListOf(1, 2, 3)
    for (item in myList) {
        println(item)
        if (item > 1) break
    }
}
