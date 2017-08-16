package MapSP

fun retrieveMap1(m: Map<String, String>) {
    println("= retrieveMap1 =")
    println("Keys:")
    for (key in m.keys) {
        println(key)
    }
    println("Values:")
    m.values.map { println(it) }
}

fun retrieveMap2(m: Map<String, String>) {
    println("= retrieveMap2 =")
    m.entries.map { println(it.key + ": " + it.value) }
}


fun createMap(): Map<String, String> {
    println("=== createMap ===")
    var m1 : MutableMap<String, String> = HashMap<String, String>()
    m1["Zara"] = "8"
    m1.put("Mahnaz", "31")
    m1.put("Ayan", "12")
    m1.put("Daisy", "14")
    println("Map Elements")
    println("\t$m1")
    return m1
}


fun createMap2() {
    println("=== createMap2 ===")
    val m1 = hashMapOf("a" to "aa", "b" to "bb")
    println("m1: $m1")
}


fun mapWithDefault() {
    println("=== mapWithDefault ===")
}


fun retrieveMap(m1: Map<String, String>) {
    println("=== retrieveMap ===")
    println("Contain K Allen? " + m1.containsKey("Allen"))
    println("Contain K Zara? " + m1.containsKey("Zara"))
    println("Contain V 14? " + m1.containsValue("14"))
    println("Contain V 18? " + m1.containsValue("18"))
    println("Zara: " + m1["Zara"])
    println("Allen: " + (m1["Allen"] ?: 0))
    println("Set: " + m1.entries)
    retrieveMap1(m1)
    retrieveMap2(m1)
}


fun mapToList(m1: Map<String, String>) {
    println("=== mapToList ===")
    println("List: " + m1.toList())
}


fun mapValues(m1: Map<String, String>) {
    println("=== mapValues ===")
    val m2 = m1.mapValues { "${it.value}@v" }
    println("After mapValues: $m2")
}


fun listToMap() {
    println("=== listToMap ===")
    val l1 = listOf('A' to 'a', 'B' to 'b')
    println("List to map: " + l1.associate { it.first to it.second })
}


fun mapFilter() {
    println("=== mapFilter ===")
    val m1 = mapOf("a" to 1, "b" to null, "c" to 3)
    println("m1: $m1")
    val m2 = m1.filter { it.value != null }
    println("m2: $m2")
    val m3 = m2.filter { it.value!! < 2}
    println("m3: $m3")
}


fun main(args: Array<String>) {
    val m1 = createMap()
    retrieveMap(m1)
    mapToList(m1)
    mapValues(m1)
    listToMap()
    createMap2()
    mapFilter()
}
