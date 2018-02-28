package learning.basics

interface Time {
    fun setTime(hours: Int, mins: Int = 0, secs: Int = 0)
    fun setTime(time: KevinTime) = setTime(time.hours)
    fun getTime(): String
}

interface EndOfTheWorld {
    fun setTime(time: KevinTime) {}
}

class KevinTime {

    // define a tag
    val TAG = KevinTime::class.simpleName

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

    var student1 = Student.createPostgrad("Kevin")
    var student2 = Student.createUndergrad("Linda")

}




class Undergraduate(firstName: String) : Student(firstName, "", 1){

}

class Postgraduate(firstName: String) : Student(firstName, "", 1){

}