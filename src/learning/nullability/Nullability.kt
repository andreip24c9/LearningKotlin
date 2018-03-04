package learning.nullability

fun main(args: Array<String>) {

    val m: Meeting? = Meeting()

    // safe call ?. -> only executes if meeting not null
    m?.method()

    // elvis operator ?: -> if m not null assign to newMeeting else assign a new meeting
    val newMeeting = m ?: Meeting()

    // safe cast as? -> if m is ISavable then savable becomes a reference to the meeting else it becomes null
    val savable: ISavable? = m as? ISavable

    // not null assertion !! -> if we know exactly that the type is never going to be null, if it is, NullPointerEx
    m!!.method()
}


class Meeting() {
    fun method(){}
}

interface ISavable