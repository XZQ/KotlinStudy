package bylazy

/**
 * @author  XZQ
 * @date  2020/5/18 12:00
 *
 */

fun main(args: Array<String>) {
    val b = BaseImpl("base")
    b.print()

//    Derived(b).print()
    val derived = Derived(b)
    derived.print()

}

interface Base {
    fun print()
}

class BaseImpl(private val x: String) : Base {
    override fun print() = println(x)
}

class Derived(base: Base) : Base by base