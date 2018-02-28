package learning.basics

class Question {
    var Answer: String? = null
    val CorrectAnswer: String = "42"
    val Question: String = "What is the answer of life and everything?"

    fun display() {
        println("Yout said $Answer")
    }

}