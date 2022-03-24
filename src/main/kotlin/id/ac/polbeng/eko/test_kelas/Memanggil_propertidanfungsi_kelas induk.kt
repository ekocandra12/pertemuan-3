package id.ac.polbeng.eko.test_kelas

open class EmployeeF {
    open val baseSalary: Double= 10000.0
    open fun displayedDetails(){
        println("I am an Employee")
    }
}

class Developer: EmployeeF(){
    override  var baseSalary: Double = super.baseSalary + 10000.0
    override fun displayedDetails() {
        super.displayedDetails()
        println("I am an Developer")
    }
}
fun main (){
    val employeeF = EmployeeF()
    println("${employeeF.javaClass.simpleName} base salary is ${employeeF.baseSalary}")
    println(employeeF.displayedDetails())
    val developer = Developer()
    println("${developer.javaClass.simpleName} base salary is ${developer.baseSalary}")
    println(developer.displayedDetails())

    /**
     * ketika kita meng-override property atau fungsi anggota kelas dari kelas induk, maka dari kelas anak kita dapat
     * mengakses properti atau fungsi anggota dari kelas induknya.
     */
}