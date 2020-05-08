/**
 * @author  XZQ
 * @date  2020/5/4 15:41
 *
 */
fun main(args: Array<String>) {
    checkArgs(args)
    val args1 = args[0].toInt()
    val args2 = args[1].toInt()
    println("${args1}+${args2}=${sum(args1, args2)}")
}

fun sum(args1: Int, args2: Int): Int {
    return args1 + args2
}

fun checkArgs(args: Array<String>) {
    if (args.size < 2) {
        System.exit(-1)
    }
}