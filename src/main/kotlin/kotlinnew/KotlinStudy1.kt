package kotlinnew

import javax.swing.plaf.basic.BasicPopupMenuSeparatorUI

/**
 * @author  XZQ
 * @date  2020/6/5 11:30
 * 重学kotlin 第一天
 */



fun main(args: Array<String>) {

    var array = ArrayList<String>()
    var str = joinToString(array)
}

@JvmOverloads
fun <T> joinToString(collection: Collection<T>, separator: String = ",", prefix: String = "", postfix: String = ""): String {
    return ""
}

//
fun maxs(num: Any): String = when (num) {
    is String -> ""
    is Int -> ""
    else -> ""
}


//
fun min(x: Int) = when {
    x > 0 -> ""
    x < 0 -> ""
    else -> ""
}


//
fun max(x: Int) = when (x) {
    0 -> print("${x}")
    1 -> print("${x}")
    else -> print("${x}")
}

//
val max = if (true) {

} else {

}