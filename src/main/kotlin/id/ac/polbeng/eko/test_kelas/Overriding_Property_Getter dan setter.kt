package id.ac.polbeng.eko.test_kelas

open class NewPerson {
    open var age:Int = 1
}

class CheckedPerson: NewPerson (){
    override  var age: Int = 1
    set(value) {
        field = if (value > 0) value else throw IllegalAccessException("Age can not be negative")
    }
}

fun main(){
    val person = NewPerson ()
    person.age = -5

    val checkedPerson = CheckedPerson()
    checkedPerson.age = -5

    /**
     * Kita dapat meng-override property kelas menggunakan inisialisasi atay menggunakan custom setter dan getter function
     */
}