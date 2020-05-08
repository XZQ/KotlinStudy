package generics

/**
 * @author  XZQ
 * @date  2020/5/9 1:21
 *
 */
fun main(args: Array<String>) {

}

/*
* 泛型函数
* */
fun <T> isEquals(a: T, b: T): Boolean {
    return a == b
}