package learning

class Person(var name: String) {

    fun display() {
        println("Disply: $name")
    }

    fun displayWithLambda(func: (s: String) -> Unit) {
        func(name)
    }

}