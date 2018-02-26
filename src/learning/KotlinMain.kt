package learning

fun main(args: Array<String>) {

    // basic Kotlin and Lambda
    val person1 = Person("Kevin")
    person1.display()
    person1.displayWithLambda(::printName)
    person1.displayWithLambda { printName(person1.name) }

    println("Ana are mere ${person1.name}")

    // null checks
    val q: Question? = null
    q?.Answer = "42"

    // ternary operator
    val message = if (q?.Answer == q?.CorrectAnswer) {
        "Correct"
    } else {
        "Wrong"
    }

    println(message)

    var kevinTime = KevinTime()
    var time = YetiTime()

    time.setTime(kevinTime)
    time.testMethod()
}

// function to use inside lambda
fun printName(name: String) {
    println(name)
}

interface Time {
    fun setTime(hours: Int, mins: Int = 0, secs: Int = 0)
    fun setTime(time: KevinTime) = setTime(time.hours)
    fun getTime(): String
}

interface EndOfTheWorld {
    fun setTime(time: KevinTime) {}
}

class KevinTime {
    var hours: Int = 0
    var minutes: Int = 0
    var seconds: Int = 0
}

class YetiTime : Time, EndOfTheWorld {
    override fun getTime(): String {
        val i = "Ana are mere"
        return i
    }

    override fun setTime(time: KevinTime) {
    }
//    override fun setTime(time: kotlin.KevinTime) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }

    override fun setTime(hours: Int, mins: Int, secs: Int) {
    }

    fun testMethod() {
    }

}
