package id.ac.polbeng.eko.test_kelas

open class Rectangle {
    open fun draw(){
        println("From Base Class Rectangle")
    }
}

interface Polygon {
    fun draw(){
        println("From interface Polygon")
    }
}

class Square() : Rectangle(), Polygon {
    override fun draw() {
        super<Rectangle>.draw()
        super<Polygon>.draw()
    }
}

fun main(){
    val square = Square()
    square.draw()

    /**
     * Di Kotlin, implementasi inheritance diatur dengan aturan (rule) : jika sebuah kelas mewarisi
    implementasi method yang sama atau ganda dari kelas induk perantara, maka ia mesti di override
    dan menyediakan implementasinya. Untuk menunjukan supertype dari kelas yang diwarisi oleh
    anggota dapat dilakukan dengan menggunakan keyword super<Base>.
     */
}