package NullSafeSP


data class Rectangle(
        val length: Int,
        val width: Int
)



fun noElvis() {
    println("=== noElvis ===")
    val b: Rectangle? = null
    val l: Int = if (b != null) b.length else -1
    println("l: $l")
}


fun useElvis() {
    println("=== useElvis ===")
    val b: Rectangle? = null
    val l: Int = b?.length ?: -1
    println("l: $l")
}


fun noElvisAndStatements() {
    println("=== noElvisAndStatements ===")
    val b: Rectangle? = null
    if (b == null) {
        // 如果再加一行 IDE 就不会提示要改成 elvis
        return
    }
    val l: Int = b.length
    println("l: $l")
}


fun elvisAndStatements() {
    println("=== elvisAndStatements ===")
    val b: Rectangle? = null
    b ?: return
    val l: Int = b.length
    println("l: $l")
}


fun main(args: Array<String>) {
    noElvis()
    useElvis()
    noElvisAndStatements()
    elvisAndStatements()
}
