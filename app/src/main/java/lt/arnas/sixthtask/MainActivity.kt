package lt.arnas.sixthtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var companyListView: ListView
    lateinit var company: Company
    lateinit var adapter: ArrayAdapter<Employee>

    val TAG = "my_tag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        company = Company("Shift4", 15)

        createAndAddEmployees()
        setupEmployeeListView()
    }

    private fun createAndAddEmployees() {
        var employee1 = Employee("Arnas", "Kasparavicius", "50006122224")
        var employee2 = Employee("Tom", "Johnson", "50002132555")
        var employee3 = Employee("Keith", "Jackson", "50001122494")
        var employee4 = Employee("Doug", "McDonald's", "500012123599")

        company.addToCompany(employee1, "POS Support", 4)
        company.addToCompany(employee2, "QA Engineer", 2)
        company.addToCompany(employee3, "Android developer", 1)
        company.addToCompany(employee4, "Payments Support", 5)
    }

    private fun setupEmployeeListView() {
        companyListView = findViewById(R.id.companyListView)
        adapter = ArrayAdapter(
            this, android.R.layout.simple_list_item_activated_1, company.employees
        )
        companyListView.adapter = adapter
    }
}