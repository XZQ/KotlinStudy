/**
 * @author  XZQ
 * @date  2020/5/21 10:58
 *
 */

fun main(args: Array<String>) {

    val intArray: Array<Number>? = null
    setArrayNumber(intArray)

}

fun setArrayNumber(array: Array<in Integer>?) {
    var str: String = "数组元素依次排列"

}

//5 "?"  "?:"  "!!"  "=="  "!=" "===" "!==="
//var string: String? = "XZQ"
//val length = string?.length ?: -1// 成立之前，否则之后
//val lenght1 = string!!.length//必须非空，否则空指针
//val a = 127
//var b = a
//var c: Int? = 1000000000
//val d: Int? = c
//    var b = "string"
//    var b1 = "string"
//    val son = Son("string")
//    val son1 = Son("string")
//println(" ${a == b}  ${a === b}  ${a.equals(b)}   ")
//println(" ${c == d}  ${c === d}  ${c?.equals(d)}   ")
//    println(" ${a == a1}  ${a === a1}  ${a !== a1}  ${a.equals(a1)}  ")
//    println(" ${b == b1}  ${b === b1}   ${b.equals(b1)}  ")
//    println(" ${son == son1}  ${son === son1}  ${son.equals(son1)}  ")

// 4容器
val list1: List<String> = listOf("XZQ", "IBM", "Google", "FaceBook", "Alibaba", "Tencet")//Array
val list2: MutableList<String> = mutableListOf("XZQ", "IBM")//ArrayList
val set1: Set<String> = setOf()
val set2: Set<String> = mutableSetOf() //LinkedHashSet
val map1: Map<String, String> = mapOf("XZQ" to "XZQ", "IBK" to "IBM")//LinkedHashMap
val map2: Map<String, String> = mutableMapOf(Pair("IBM", "IBM"), Pair("IBK", "IBM"))//LinkedHashMap
// 遍历
// for in
// iterator
// forEach
// 循环的中断
/* 1 return 中断后面的代码
 * 2 return@X 只过滤当前的这一次
 * 3 run breaking@ 和Java break一样
 *   run breaking@{
        list1.forEach A@{
            if ("FaceBook" === it) return@breaking
            println(it)
        }
    }
 */


// 3字符串
val string: String = "XZQ"
//string.substring
//string.indexOf
//string.replace
//string.split


// 2数组
var intArray: IntArray = intArrayOf(1, 2, 3, 4)
var strArray: Array<String> = arrayOf("XZQ", "IBM", "Google")
// get

// 1 基本数据类型
var a: Int = 1
val b = 1
var c: String = a.toString()

