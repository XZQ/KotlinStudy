/**
 * @author  XZQ
 * @date  2020/5/3 3:30
 *
 */

val arrayOfInt: IntArray = intArrayOf(1, 2, 3, 4, 5)
val arrayOfchar: CharArray = charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd')
val arrayOfString: Array<String> = arrayOf("A", "B", "C")


fun main(args: Array<String>) {

//    //遍历
//    for (a in arrayOfString) {
//        println(a)
//    }
//    for ((index, value) in arrayOfString.withIndex()) {
//        println("${index}  ${value}")
//    }
//    for (ind in arrayOfString.withIndex()) {
//        println("${ind.index}  ${ind.value}")
//    }

//    val name: String = getName() ?: return
//    println(name.length)
//
//    val name1:String?="Hello World"
//    println(name1!!.length)

//    val parent: Parent = Parent();
//    val child: Child? = parent as? Child;

//    for (a in arrayOfInt) {
//        println(a)
//    }
//    println(arrayOfchar::class.java.simpleName)
//    println(arrayOfchar::class.java.simpleName.slice(0 until 4))

//    arrayOfchar.forEach(::println)

//    // 1 除了o，全部打印,会打印--->
//    arrayOfchar.forEach ForEach@{
//        if ('o' == it) return@ForEach
//        println(it)
//    }
//    println("--------------------------->>")


//    // 2  会打印o之前的，不会打印--->
//    arrayOfchar.forEach {
//        if ('o' == it) return
//        println(it)
//    }

//    //3 除了o，全部打印,会打印--->
//    arrayOfchar.forEach Continuing@{
//        if ('o' == it) return@Continuing
//        println(it)
//    }
//    println("--------------------------->>")

//    // 4 和Java break一样的效果
//    run breaking@{
//        arrayOfchar.forEach {
//            if ('o' == it) return@breaking
//            println(it)
//        }
//    }
//    println("--------------------------->>")
}

fun getName(): String? {
    return null;
}