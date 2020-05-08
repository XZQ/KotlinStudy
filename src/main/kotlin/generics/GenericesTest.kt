package generics

/**
 * @author  XZQ
 * @date  2020/5/9 1:21
 * https://blog.csdn.net/qq_39969226/article/details/94782338
 */
fun main(args: Array<String>) {

}

/*
* 泛型函数
* */
fun <T> isEquals(a: T, b: T): Boolean {
    return a == b
}

/*
* 多类型参数
* */
fun <T, U> addRectangle(a: T, b: U): U {
    return b
}

/*
*泛型约束主要用于泛型函数和泛型类的声明
* */
fun <T : Comparable<T>> isEqual(a: T, b: T): Boolean {
    return a == b
}

private fun <T : Number> isEqual(a: T, b: T): Boolean {
    return (a == b)
}
