package learning.basics

class Person(var name: String) {

    fun display() {
        println("Disply: $name")
    }

    fun displayWithLambda(func: (s: String) -> Unit) {
        func(name)
    }

}

open class ClassTest(var name: String = "", var age: Int = 0) {

//    var age: Int = 0

//    constructor(name: String, age: Int) : this(name) {
//        this.age = age
//    }

    fun testMethod(): String {
        return this.name
    }

    fun testMethod2(): Int {
        return age
    }
}