package method

/**
 * @author  XZQ
 * @date  2020/5/8 0:36
 *
 */

fun main(args: Array<String>) {
//    cost { }
}

fun cost(block: () -> Unit) {
    val start = System.currentTimeMillis()
    block()
    val end = System.currentTimeMillis()
    println("${end - start}")
}

fun fibonacci(): () -> Long {
    var first = 0L
    var second = 1L
    return {
        val next = first + second
        val current = first
        first = second
        second = next
        current
    }
}