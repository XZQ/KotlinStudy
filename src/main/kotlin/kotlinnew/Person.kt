package kotlinnew

/**
 * @author XZQ
 * @date 2020/6/5 11:48
 */
//class Person(val name: String) {
//    var age: Int = 0
//        get() = 18
//        set(value) {
//            field = value
//        }
//}

interface Language {
    //默认方法
    fun use() = println("使用语言编程")
}


interface Java : Language {
    //抽象属性
    var className: String

    //提供访问器的属性
    val field: String
        get() = ""

    //默认方法
    override fun use() = println("使用Java语言编程")


    //抽象方法
    fun absMethod()
}