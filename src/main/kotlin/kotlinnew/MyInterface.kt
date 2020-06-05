package kotlinnew

/**
 * @author  XZQ
 * @date  2020/6/5 15:04
 * https://www.jianshu.com/p/0bfb9e2ec472
 */
interface MyInterface {

    //抽象属性
    var length: Int

    //提供访问器的属性
    val name: String
        get() = ""

    //抽象方法
    fun daqi()

    //非抽象方法（即提供默认实现方法）
    fun defaultMethod() {

    }
}