package learning.basics

abstract class Person2(var firstName: String, var lastName: String) {

    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress(): String
}

open class Student(firstMame: String, lastName: String, _id: Int) : Person2(firstMame, lastName) {

    val id: Int
    lateinit var tutor: String

    init {
        id = _id
    }

    constructor(firstName: String, lastName: String, _id: Int, tutor: String) : this(firstName, lastName, _id) {
        this.tutor = tutor
    }

    override fun getAddress(): String = ""

    override fun getName(): String {
        return ""
    }

    companion object {
        fun createUndergrad(name:String) : Undergraduate {
            return Undergraduate(name)
        }

        fun createPostgrad(name:String) : Postgraduate {
            return Postgraduate(name)
        }
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