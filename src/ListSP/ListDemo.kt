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


fun listAndType() {
    println("=== listAndType ===")
    val myList = mutableListOf<Int>()
    print("$myList")
}


fun main(args: Array<String>) {
    listBasicOp()
    listAndType()
}
