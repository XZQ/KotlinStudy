/**
 * @author  XZQ
 * @date  2020/5/4 22:44
 *
 */
class Fatcher {
    var b = 0


    lateinit var c: String


    lateinit var son: Son

    val son1: Son by lazy {
        Son()
    };
}

class Son

private const val USER = 1
private const val DEBUG = 2

fun main(args: Array<String>) {
    // if 有返回值
    val mode = if (true) {
        USER
    } else {
        DEBUG
    }
}