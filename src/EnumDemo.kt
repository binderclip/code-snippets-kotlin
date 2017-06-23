enum class MyEnum(val v: Int) {
    IT_A(1),
    IT_B(2),
    IT_C(3);
}

fun main(args: Array<String>) {
    MyEnum.values().map { println("$it: ${it.v}") }
}
