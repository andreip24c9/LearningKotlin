package learning.sequences

fun iter(seq: Sequence<String>) {
    for (t in seq) println(t)
}

fun main(args: Array<String>): Unit {

    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))

    // sequence allows for lazy evaluation - *titles* gets evaluated only when terminated/processed, namely passed to
    // the iter method that calls the termination of the operation therefore evaluating as it goes
    // also the evaluation terminates after finding the result, example below with BOARD meeting
    val titles: Sequence<String> = meetings
            .asSequence()
            .filter {
                println("filter($it)")
                it.title.endsWith("g")
            }
            .map {
                println("map($it)")
                it.title
            }
    iter(titles)


    val title = meetings
            .asSequence()
            .map { m ->
                println("map($m)")
                m.title.toUpperCase()
            }
            .find { m -> m.startsWith("BOARD") }
    println(title)

}

class Meeting(val id: Int, val title: String) {
    val people = listOf(Person("Person1"), Person("Person2"))
}

data class Person(val name: String)
