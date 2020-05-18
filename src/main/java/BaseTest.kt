///**
// * @author XZQ
// * @date 2020/5/18 11:45
// */
//object BaseTest {
//    @JvmStatic
//    fun main(args: Array<String>) {
//        val base1Impe = Base1Impe("XZQ")
//        base1Impe.print()
//    }
//}
//
//internal interface Base1 {
//    fun print()
//}
//
////internal class Base1Impe : Base1 {
////    private var x: String? = null
////
////    constructor() {}
////    constructor(x: String?) {
////        this.x = x
////    }
////
////    override fun print() {
////        if (x != null) {
////            println(x)
////        }
////    }
////}
//
//internal class Base1Imp(x: String) : Base1 {
//    var x: String
//
//    init {
//        this.x = x
//    }
//
//    override fun print() {
//    }
//}
//
//internal class Base1Impe constructor() : Base1 {
//
//    lateinit var x: String
//
//
//    constructor(x: String) : this() {
//        this.x = x
//    }
//
//
//    override fun print() {
//    }
//
//}