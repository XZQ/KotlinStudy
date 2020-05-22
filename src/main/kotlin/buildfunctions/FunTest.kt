package buildfunctions

/**
 * @author  XZQ
 * @date  2020/5/19 15:03
 *
 */
fun main(args: Array<String>) {
    val f1: (Int) -> Unit = { p: Int ->
//        println("参数为" + p)
    }

    arrayOf("XZQ", "IBM").map { }.asSequence().forEach {
//        println(it)
    }

    var str = "xzq"
    val alse = str.also {
        it.toUpperCase()
    }
//    println(alse)

    println(listOf(1, 2, 3, 4, 5).asSequence().filter {
        println("filter ${it}")
        it > 3
    }.map {
        println("map ${it}")
        it * 2
    }.forEach(::println)
    )
}

fun fun2() {
    println("XZQ")
}