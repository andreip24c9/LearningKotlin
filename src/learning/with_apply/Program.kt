package learning.with_apply

import java.util.*

fun main(args: Array<String>) {
    val m = Meeting()
    m.title = "Board Meeting"
    m.date = Date()
    m.who.add("Kevin")

    with(m) {
        title = "Board Meeting"
        date = Date()
        who.add("Kevin")
    }

    m.apply {
        title = "Board Meeting"
        date = Date()
        who.add("Kevin")
    }.create()
}

class Meeting {

    var title: String = "Board Meeting"
    var date: Date = Date()
    var who = mutableListOf<String>()

    fun create() {}
}