package method

/**
 * @author  XZQ
 * @date  2020/5/8 0:36
 *
 */

fun main(args: Array<String>) {
//    cost { }
//    val index = 3
//    val num = run {
//        when (index) {
//            0 -> "kotlin"
//            1 -> "java"
//            2 -> "php"
//            3 -> "javaScript"
//            else -> "none"
//        }
//    }.length

    val a: String? = "null"
    println(a!!)
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
