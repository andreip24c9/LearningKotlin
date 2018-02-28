package learning.collections

// filter - transform collection and filter out unwanted items, similar to WHERE in SQL
// map - transform single item and, similar to SELECT in SQL (? thfuq no)

fun main(args: Array<String>) {
    val ints = listOf(1, 2, 3, 4, 5, 6, 7)
//    val smallInts = ints.filter { it < 4 }
//
//    // normal for
//    for (i: Int in (0 until smallInts.size))  println(smallInts[i])
//    // foreach
//    for (i: Int in smallInts)  println(i)
//
//
//
//    val squareInts = ints.map { it * it }
//    for (i: Int in squareInts) println(i)
//
//
//    val smallSquareInts = ints
//            .filter { it < 4 }
//            .map { it * it }
//    for (i: Int in smallSquareInts) println(i)
//
//
//
//    val meetings = listOf(Meeting(1, "Meeting1"), Meeting(2, "C_Meeting2"))
//    val titles: List<String> = meetings
//            .filter { m -> m.title.startsWith("C") }
//            .map { m -> m.title }
//    for (t in titles) println(t)


//    // reusable predicate
//    val greaterThanThree = { v: Int -> v > 3 }
//
////    var largeInts = ints.all { it > 3 }
//    var largeInts = ints.all(greaterThanThree)
//    println(largeInts)
//
//    largeInts = ints.any(greaterThanThree)
//    println(largeInts)
//
//    val noLargeInts = ints.count(greaterThanThree)
//    println(noLargeInts)
//
//    // first element that matches, else null, hence ?
//    val found: Int? = ints.find(greaterThanThree)
//    println(found)

    val meetings2 = listOf(Meeting(1, "A_Meeting1"), Meeting(2, "B_Meeting2"))
    // map woud return List<List<Person>>
    val peopleInMeetings = meetings2
            .flatMap(Meeting::people)
            // removes duplicates - Set basically - distinct relies on hashCode and equals within the type -> Person in this case
            .distinct()
    for (p in peopleInMeetings) println(p.name)

}

class Meeting(val id: Int, val title: String) {
    val people = listOf(
            Person("Person1"),
            Person("Person2"),
            Person("Person3"))
}

data class Person(val name: String)