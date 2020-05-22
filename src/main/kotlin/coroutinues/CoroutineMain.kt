package coroutinues

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * @author  XZQ
 * @date  2020/5/21 10:29
 *
 */
fun main(args: Array<String>) {

//    val launch = GlobalScope.launch {
//        println("mina ${Thread.currentThread().name}  ${Thread.currentThread().id}")
//    }
//    runBlocking {
//
//        repeat(10) {
//            val launch = GlobalScope.launch {
//                println("IO ${Thread.currentThread().name}  ${Thread.currentThread().id}")
//            }
//        }
//    }
//
//    runBlocking {
//        GlobalScope.launch {
//            println("27   ")
//            val token = preparePost()
//            println("token=${token}   ")
//        }
//    }


// 启动一个协程
    GlobalScope.launch {
        delay(1000)
        println("Hello")
    }

    Thread.sleep(2000) // 等待 2 秒钟
    println("Stop")

}


suspend fun preparePost(): String {
    delay(2000L)
    return "XZQ"
}
