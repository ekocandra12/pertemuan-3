package id.ac.polbeng.eko.test_kelas

open class Teacher {
    // Must use "open" modifier to allow child classes to override it
    open fun teach() {
        println("Teaching...")
    }
    fun info(){
        println("I'am a Teacher.")
    }
}
class MathsTeacher : Teacher() {
    // Must use "override" modifier to override a base class function
    override fun teach() {
        println("Teaching Maths...")
    }
    /**
     * Kotlin membutuhkan eksplisit akses modifier untuk meng-override fungsi pada kelas induk yaitu
    akses modifier open.
     */
}
fun main() {
    val teacher = Teacher()
    val mathsTeacher = MathsTeacher()
    mathsTeacher.info()
    teacher.teach()
    mathsTeacher.teach()
}