
fun main(args: Array<String>) {
    // create
    var m1 : MutableMap<String, String> = HashMap<String, String>()
    m1["Zara"] = "8"
    m1.put("Mahnaz", "31")
    m1.put("Ayan", "12")
    m1.put("Daisy", "14")
    println()
    println("Map Elements")
    println("\t$m1")
    println("Contain K Allen? " + m1.containsKey("Allen"))
    println("Contain K Zara? " + m1.containsKey("Zara"))
    println("Contain V 14? " + m1.containsValue("14"))
    println("Contain V 18? " + m1.containsValue("18"))
    println("Zara: " + m1["Zara"])
    println("Allen: " + (m1["Allen"] ?: 0))
    println("Set: " + m1.entries)
    retrieveMap1(m1)
    retrieveMap2(m1)
    println("List: " + m1.toList())
    // mapValues
    val m2 = m1.mapValues { "${it.value}@v" }
    println("After mapValues: $m2")
}

fun retrieveMap1(m: Map<String, String>) {
    println("== Retrieve Map 1 ==")
    println("Keys:")
    for (key in m.keys) {
        println(key)
    }
    println("Values:")
    m.values.map { println(it) }
    println("====")
}

fun retrieveMap2(m: Map<String, String>) {
    println("== Retrieve Map 2 ==")
    m.entries.map { println(it.key + ": " + it.value) }
    println("====")
}
