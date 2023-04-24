package lt.arnas.sixthtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    
    val TAG = "my_tag"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var employee1 = Employee("Arnas", "Kasparavicius", "5001211494")
    }
}