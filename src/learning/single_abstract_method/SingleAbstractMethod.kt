package learning.single_abstract_method

import old_java.java_classes.User

fun times(count: Int): String {
    return if (count == 1) "time" else "times"
}

fun main(args: Array<String>) {
    val user = User("Joe")
    var count = 0

    user.create { u ->
        println("User $u has been created ${++count} ${times(count)}")
    }
    user.create { u ->
        println("User $u has been created ${++count} ${times(count)}")
    }
}