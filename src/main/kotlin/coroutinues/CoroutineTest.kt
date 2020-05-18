package coroutinues

import kotlinx.coroutines.*


/**
 * @author  XZQ
 * @date  2020/5/11 7:14
 *
 */


//fun main(args: Array<String>) {
//
//
////    GlobalScope.launch {
////        delay(1000L)
////        println("World!") // 延迟后打印
////    }
//
////    println("Hello, args") // 当协程延迟时，主线程还在跑
////    Thread.sleep(2000L) // 阻塞主线程2s，为了让jvm不挂掉
//
//
//    // runBlocking 阻塞线程
////    println("Hello,") // 主线程立即继续跑
//    runBlocking {
//        println("----------->")
//        launch {
//            delay(1000L)
//            println("Hello, World!") // 延迟后打印
//        }
//        println("------++++++++----->")
//        delay(2000L)  // 延迟2s，让jvm不挂掉
//        println("------2000L----->")
//    }
////    println("runBlocking")
//
//    val job = GlobalScope.launch {
//
//    }
//}

//fun main(args: Array<String>) = runBlocking<Unit> { // 开始主协程
//    val jobs = List(100000) {
//        launch {
//            delay(1000L)
//            println("Word")
//        }
//    }
//    jobs.forEach {
//        println(it)
//    }
//    val viewModelJob = Job()    //用来取消协程
//    CoroutineScope(Dispatchers.Default + viewModelJob)
//}

fun main(args: Array<String>) {
    test()
    println("协程结束!")
}

fun test() = runBlocking {
    repeat(10) {
        println("协程挂起 ${it}")
        delay(1000L)
    }
}

suspend fun doWorld() {
    delay(1000L)
    println("World!")
}