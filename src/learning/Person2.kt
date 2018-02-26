package learning

abstract class Person2 {
    var firstName: String = ""
    var lastName: String = ""

    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress(): String
}

class Student : Person2() {
    override fun getAddress(): String = ""

    override fun getName(): String {
        return ""
    }
}

//enums?
sealed class PersonEvent {
    class Awake : PersonEvent()
    class Asleep : PersonEvent()
    class Eating(val food: String) : PersonEvent()
}

fun handlePersonEvent(event: PersonEvent) {
    when (event) {
        is PersonEvent.Awake -> println("Awake")
        is PersonEvent.Asleep -> println("Asleep")
        is PersonEvent.Eating -> println(event.food)
    }
 }