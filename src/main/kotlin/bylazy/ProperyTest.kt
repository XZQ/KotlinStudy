package bylazy

import java.math.BigInteger
import kotlin.reflect.KProperty

/**
 * @author  XZQ
 * @date  2020/6/4 11:35
 *
 */

fun main(args: Array<String>) {
//    val e = Example()
//    println(e.p)

}


val num by lazy {

    BigInteger.valueOf(120).mod(BigInteger.valueOf(120))
}

class Example {
    var p: String by Delegate()
}

class Delegate {

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}