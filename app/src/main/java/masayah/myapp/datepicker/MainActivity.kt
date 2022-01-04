package masayah.myapp.datepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import java.time.*

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val eText = findViewById<View>(R.id.datepicker) as EditText
        eText.setOnClickListener {
            // ドラムロール式DatePickerを呼び出す
            MyDatePicker.showDatePicker(eText)
        }
    }

}