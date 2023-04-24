package lt.arnas.sixthtask

import java.time.LocalDate
import java.time.Period

class Employee (
    var firstName: String,
    var lastName: String,
    var asmID: String
        ) {

    var age: Int = 0
    private set

    var role: String = ""
    var exp: Int = 0

    init {
        age = countAge()
    }

    private fun countAge(): Int {
        var countAge =
            if (asmID[0] == '3' || asmID[0] == '4') {
                "19" + asmID.substring(1, 3) +
                        "-" + asmID.substring(3, 5) +
                        "-" + asmID.substring(5, 7)
            }else "20" + asmID.substring(1, 3) +
                    "-" + asmID.substring(3, 5) +
                    "-" + asmID.substring(5, 7)

        var birthDay: LocalDate = LocalDate.parse(countAge)

        return Period.between(birthDay, LocalDate.now()).years
    }
}