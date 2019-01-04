// Parent class
abstract class Person(open val name: String,open var age: Int) {
    // function without parameters
//    fun speak() {
//        println("Hello!")
//    }

    // make speak function abstract
    abstract fun speak()

    // function with parameters
    fun greet(name: String) {
        println("Hello $name!")
    }

    // function with return value
//    fun getYearOfBirth(): Int {
//        return 2019 - age
//    }

    // simplify
    fun getYearOfBirth() = 2019 - age
}

fun main(args: Array<String>) {
    // cannot create general object -> Person
    // because it's abstract
//    val person = Person("Jack", 17)
//
//    person.speak()
//    person.greet("world")
//    println(person.getYearOfBirth())
}