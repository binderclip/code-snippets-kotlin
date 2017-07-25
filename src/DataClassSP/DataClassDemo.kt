package DataClassSP

data class DataClassDemo(
        val id: Long,
        val title: String,
        val description: String = ""
)

fun main(args: Array<String>) {
    val dc1 = DataClassDemo(1, "Hello", "DataCalss Demo!")
    println(dc1)
}
