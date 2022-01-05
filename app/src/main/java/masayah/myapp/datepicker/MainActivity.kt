package masayah.myapp.datepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.os.Build
import android.util.Log
import android.widget.ImageView
import androidx.annotation.RequiresApi
import java.time.*

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img = findViewById<ImageView>(R.id.date_picker_actions)
        img.setOnClickListener {
            // ドラムロール式DatePickerを呼び出す
            val eText = findViewById<View>(R.id.date) as EditText
            MyDatePicker.showDatePicker(eText)
        }
    }

}