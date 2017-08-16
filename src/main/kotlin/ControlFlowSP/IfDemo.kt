package ControlFlowSP

fun main(args: Array<String>) {
    val c = true

    // one line
    if (c) println("c is true")

    val a = if (c) 1 else 0
    println("a = $a")
}
