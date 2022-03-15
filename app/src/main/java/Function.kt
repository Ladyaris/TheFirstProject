fun main () {
    val name = "Lady"
    morning(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    evening(name)
    evening(name)
    evening(name)
    night(name)
    morning(name)
    goodbye(name)
    goodbye(name)
}

fun morning(name: String){
    println("Good Morning ${name}")
}
fun afternoon(name: String) {
    println("Good afternoon ${name}")
}
fun evening(name: String) {
    println("Good evening ${name}")
}
fun night(name: String){
    println("Good Night ${name}")
}
fun goodbye(name: String) {
    println("Goodbye ${name}")
}