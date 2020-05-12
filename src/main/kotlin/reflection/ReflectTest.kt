package reflection

/**
 * @author  XZQ
 * @date  2020/5/10 0:10
 *
 */

fun main(args: Array<String>) {
//    println(String::class)
//    println(String::class.java)

//    val number = listOf(1, 2, 3)
//    println(number.filter { isOdd(it) })
//    var hello = Hello("XZQ", 32)
//    println(hello::class)
//    println(Hello::class.java)

//    var clazz = Hello::class.java


//    //星型投影
//    val list = mutableListOf<String>()
//    list.add("!")
//    list.add("2")
//    reportInfo(list)

}

fun reportInfo(mutableList: MutableList<*>) {
//    mutableList[0] = "ss" 错误
    println(mutableList[1])

}



// 命名函数
fun isOdd(x: Int): Boolean = x % 2 != 0