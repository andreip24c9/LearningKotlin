package learning.single_abstract_method

import old_java.java_classes.Created
import old_java.java_classes.User

fun times(count: Int): String {
    return if (count == 1) "time" else "times"
}

fun main(args: Array<String>) {
    val user = User("Joe")
    var count = 0

    // using it
    user.create { println("User $it has been created ${++count} ${times(count)}") }

    // using event listener
    val eventListener = { u: User ->
        println("User $u has been created ${++count} ${times(count)}")
    }
    user.create(eventListener)

    // SAM constructor needed when the kotlin compiler can't work out what you need
    val eventListener2 = Created({ println("User $it has been created ${++count} ${times(count)}") })
    user.create(eventListener2)
}