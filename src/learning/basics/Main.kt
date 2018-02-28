package learning.basics

class Main {

    // companion object creates the object at runtime, with this you can make singletons and define static methods - psvm
    companion object {
        // to make it static for the jvm to know, to be able to make a run configuration you have to annotate it
        @JvmStatic
        fun main(args: Array<String>) {
            // basic Kotlin and Lambda
            val person1 = Person("Kevin")
            person1.display()
            person1.displayWithLambda(Companion::printName)
            person1.displayWithLambda { printName(person1.name) }

            println("Ana are mere ${person1.name}")

            // null checks
            val q: Question? = null
            q?.Answer = "42"

            // ternary operator kotlin replacement
            val message = if (q?.Answer == q?.CorrectAnswer) {
                "Correct"
            } else {
                "Wrong"
            }

            println(message)

            val kevinTime = KevinTime()
            val time = YetiTime()

            time.setTime(kevinTime)
            time.testMethod()

            var p2: Person2 = Student("ana", "are mere", 12, "tutor")
        }

        // function to use inside lambda
        private fun printName(name: String) {
            println(name)
        }
    }
}

