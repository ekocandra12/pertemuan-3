package id.ac.polbeng.eko.test_kelas

class Employee(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field
    var name: String = _name
        get() = field
        set(value) {
            field = value
        }
    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }
}
fun main() {
    val emp = Employee(1101, "Jono", 25)
    println("Id : ${emp.id}, Nama : ${emp.name}, Umur : ${emp.age}")

    /**
     * Enkapsulasi adalah konsep OOP yang memungkinkan kita untuk menyembunyikan informasi
    dari suatu kelas sehingga anggota-anggota kelas tersebut tidak bisa diakses dari luar. Biasanya di
    Java dilakukan dengan memberikan akses control private ketika mendeklarasikan suatu
    atribut/property dan menambahkan 2 method untuk mengakses atribut tersebut yaitu method
    Getter dan Setter.
     */
}