package learning.strategy_pattern

fun main(args: Array<String>) {
    val program = Program()

//    // interface way
//    program.fibonacci(8, object : Process {
//        override fun execute(value: Int) {
//            println(value)
//        }
//    })

//    // functional programming - lambda
//    program.fibonacci(8, { value -> println(value) })
//    program.fibonacci(8) { value -> println(value) }
//
//    program.fibonacci(8, { value -> externalFunction(value) })
//    program.fibonacci(8) { value -> externalFunction(value) }
//
//    // functional programming - lambda - single parameter can pe named it
//    program.fibonacci(8, { println(it) })
//    program.fibonacci(8) { println(it) }
//
//    program.fibonacci(8, { externalFunction(it) })
//    program.fibonacci(8) { externalFunction(it) }

////     functional programming - lambda - single parameter - function refference
//    program.fibonacci(8, ::println)
//    program.fibonacci(8, ::externalFunction)

    var total = 0
    program.fibonacci(8) {
        it ->
        total += it
    }
    println(total)
}

fun externalFunction(value: Int) {
    println(value)
}

interface Process {
    fun execute(value: Int)
}

class Program {

    // functional programming
    fun fibonacci(limit: Int, action: (Int) -> Unit) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit) {
            action(current)

            val temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }

    // old_java way using an interface for callbacks -> action.execute()
    fun fibonacci(limit: Int, action: Process) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit) {
            action.execute(current)

            val temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }

    // hardcoded println
    fun fibonacci(limit: Int) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit) {
            println(current)

            val temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}