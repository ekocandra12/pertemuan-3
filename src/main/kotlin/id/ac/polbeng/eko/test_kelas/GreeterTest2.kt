package id.ac.polbeng.eko.test_kelas

fun main() {
    val greeter = Greeter2()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Anton")
    greeter.greet("Budi")
    greeter.text = "Hello programmer"
    println(greeter.with_ret_val("Dono"))
}