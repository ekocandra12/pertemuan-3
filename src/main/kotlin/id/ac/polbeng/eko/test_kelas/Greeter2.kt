package id.ac.polbeng.eko.test_kelas

class Greeter2 {
    var text: String = ""
    fun greet() {
        println("Hello object world!")
    }
    fun greet(name: String) {
        println("$text $name")
    }
    fun with_ret_val(name: String): String {
        return "$text $name"
    }

    /**
     * berikut penambahan dari file Greeter berupa class member yaitu sebuah atribut dengan nama
    text dan dua buah method dengan nama greet yang mempunyai satu parameter bertipe String dan
    with_ret_val yang memiliki satu parameter bertipe String dengan nilai kembali String.
     */
}