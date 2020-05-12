package reflection

/**
 * @author  XZQ
 * @date  2020/5/10 1:24
 *
 */
data class Person(val id: Int, val name: String, val group: Group)


data class Group(val id: Int, val name: String, val location: String)