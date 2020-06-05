package bylazy

/**
 * @author  XZQ
 * @date  2020/6/4 16:56
 *
 */

inline infix fun Boolean.trueLet(trueBlock: Boolean.() -> Unit): Else {
    if (this) {
        trueBlock()
      return NotDoElse(this)
    }
    return DoElse(this)
}

inline infix fun Boolean.falseLet(falseBlock: Boolean.() -> Unit): Else {
    if (!this) {
        falseBlock()
        return NotDoElse(this)
    }
    return DoElse(this)
}

interface Else {
    infix fun elseLet(elseBlock: Boolean.() -> Unit)
}

class DoElse(val boolean: Boolean) : Else {
    override infix fun elseLet(elseBlock: Boolean.() -> Unit) {
        elseBlock(boolean)
    }
}

class NotDoElse(val boolean: Boolean) : Else {
    override infix fun elseLet(elseBlock: Boolean.() -> Unit) {

    }
}
