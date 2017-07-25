package ListSP

fun main(args: Array<String>) {
    var myList : MutableList<Int> = mutableListOf(1, 2, 3)
    myList.add(4)
    println(myList)
    println(myList.size)
    println(myList.count())     // 返回的就是 size
}
