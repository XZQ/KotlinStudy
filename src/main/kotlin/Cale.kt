import java.lang.IllegalArgumentException

/**
 * @author  XZQ
 * @date  2020/5/5 23:01
 *
 */
fun main(args: Array<String>) {
    while (true) {
        try {
            println("         3 + 4")
            val input = readLine() ?: break
            val splits = input.trim().split(" ")
            if (splits.size < 3) {
                throw IllegalArgumentException("      ")
            }
            val arg1 = splits[0].toDouble()
            val op = splits[1]
            val arg2 = splits[2].toDouble()
            println("$arg1 $op $arg2 = ${Operator(op)(arg1, arg2)}")
        } catch (e: NumberFormatException) {
            println("           ")
        } catch (e: IllegalArgumentException) {
            println("                               ")
        } catch (e: Exception) {
            println("                         ${e.message}")
        }

        println("    ?[Y]")
        val cmd = readLine()
        if (cmd == null || cmd.toLowerCase() != "y") {
            break
        }
    }
    println("            ")
}

class Operator(op: String) {

    val opFun: (left: Double, right: Double) -> Double

    init {
        opFun = when (op) {
            "+" -> { l, r -> l + r }
            "-" -> { l, r -> l - r }
            "*" -> { l, r -> l * r }
            "/" -> { l, r -> l / r }
            "%" -> { l, r -> l % r }
            else -> {
                throw UnsupportedOperationException(op)
            }
        }
    }

    operator fun invoke(left: Double, right: Double): Double {
        return opFun(left, right)
    }

}