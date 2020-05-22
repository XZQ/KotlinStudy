package buildfunctions

/**
 * @author  XZQ
 * @date  2020/5/19 11:20
 *
 *
 * https://blog.csdn.net/carson_ho/article/details/104471757
 * 1 kotlin 简化
 * 2 内置高阶函数
 * 3
 */
fun main(args: Array<String>) {
    //region  折叠

    val string: String? = "XZQ"

    // 返回最后一行的值
    var result = string?.let {
        it.toUpperCase()
        "ABC"
    }

//    println(result)

    // 返回传入的值
    var result1 = string?.also {
//        println(it.toUpperCase())
    }
//    println(result1)


    // 返回最后一行的值
    var result2 = with(string) {
        string?.toUpperCase()
    }
//    println(result2)

    //endregion

    //region 匿名函数
    val func = fun() = {
        println("XZQ")
    }

    //匿名函数
    var func3 = fun(x: Int, y: Int): Int = x + y
    //endregion
}

fun func2() {
    println("hello fun2")
}


fun fun0(x: Int) = x * 9