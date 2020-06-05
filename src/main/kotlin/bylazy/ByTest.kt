package bylazy


/**
 * @author  XZQ
 * @date  2020/5/18 12:00
 *
 */

var selectionArgs: Array<String>? = arrayOf("")

private var searchString: String? = null

private lateinit var selectionClause: String

private var selectionClause1 = "XZQ"

fun main(args: Array<String>) {


//    selectionArgs = searchString?.takeIf {
//        println("1111111111111111111")
//        it.isNotEmpty()
//    }?.let {
//        println("2222222222222222222")
//        selectionClause = "  = ?"
//        arrayOf(it)
//    }?.run {
//        println("33333333333333333333")
//        selectionClause = " "
//        emptyArray<String>()
//    }
//
//
//    if (selectionArgs === null) {
//        println("${args} i s null")
//    } else {
//        println("${args} is not null")
//    }
    (true).trueLet { println("is not null") }.elseLet {
        println("is  null")
    }

    (false).falseLet { println("is false") }.elseLet {
        println("is  true")
    }


//    // If the word is the empty string, gets everything
//    if (TextUtils.isEmpty(searchString)) {
//        // Setting the selection clause to null will return all words
//        selectionClause = null;
//        selectionArgs[0] = "";
//
//    } else {
//        // Constructs a selection clause that matches the word that the user entered.
//        selectionClause = UserDictionary.Words.WORD + " = ?";
//
//        // Moves the user's input string to the selection arguments.
//        selectionArgs[0] = searchString;
//
//    }
}

//interface Base {
//    fun print()
//}
//
//class BaseImpl(private val x: String) : Base {
//    override fun print() = println(x)
//}
//
//class Derived(base: Base) : Base by base