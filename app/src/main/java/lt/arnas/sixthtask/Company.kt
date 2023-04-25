package lt.arnas.sixthtask

class Company(var companyName: String = "",
              val yearCreated: Int = 0
             )
{
    var employees = listOf<Employee>()
        get() = _employees
    private var _employees = mutableListOf<Employee>()

    fun addToCompany(employee: Employee, role: String, exp: Int) {
        _employees.add(employee)
        employees.plus(_employees)
        employee.role = role
        employee.exp = exp
    }
}