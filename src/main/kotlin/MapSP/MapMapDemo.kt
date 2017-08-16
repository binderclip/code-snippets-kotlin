package MapSP

enum class BoardType(val v: Int) {
    TYPE_A(1),
    TYPE_B(2),
    TYPE_C(3);
}


data class BoardStats (
        val boardId: Long,
        val boardType: BoardType,
        val number: Int
)

fun main(args: Array<String>) {
    val statses: List<BoardStats> = listOf(
            BoardStats(1, BoardType.TYPE_A, 1),
            BoardStats(1, BoardType.TYPE_B, 2),
            BoardStats(2, BoardType.TYPE_A, 3),
            BoardStats(2, BoardType.TYPE_B, 4))
    var m1 : MutableMap<Long, MutableMap<BoardType, Int>> = mutableMapOf()
    for (stats : BoardStats in statses) {
        var m_in = m1[stats.boardId] ?: mutableMapOf<BoardType, Int>()
        m_in[stats.boardType] = stats.number
        m1[stats.boardId] = m_in
    }
    println(m1)
}
