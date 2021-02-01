package com.example.enumdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var editText: EditText
    lateinit var buttonClickMe: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.marks_edit)
        buttonClickMe = findViewById(R.id.btn_click)
        buttonClickMe.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        val marks = editText.text
        val marksInNumber = Integer.parseInt(marks.toString())
        when(marksInNumber){
            in 0..32 -> Toast.makeText(this,"You Are ${EnumMarks.FAIL}",Toast.LENGTH_LONG).show()
            in 33..40 -> Toast.makeText(this,"You Are ${EnumMarks.PASS}",Toast.LENGTH_LONG).show()
            in 41..45 -> Toast.makeText(this,"You Are ${EnumMarks.JUSTPASS}",Toast.LENGTH_LONG).show()
            in 56..79 -> Toast.makeText(this,"You Are ${EnumMarks.FIRSTDIVISION}",Toast.LENGTH_LONG).show()
            in 51..55 -> Toast.makeText(this,"You Are ${EnumMarks.SECONDDIVISION}",Toast.LENGTH_LONG).show()
            in 45..50 -> Toast.makeText(this,"You Are ${EnumMarks.THIRDDIVISION}",Toast.LENGTH_LONG).show()
            in 80..85 -> Toast.makeText(this,"You Are ${EnumMarks.DISTINCTION}",Toast.LENGTH_LONG).show()
            in 86..95 -> Toast.makeText(this,"You Are ${EnumMarks.FIRST}",Toast.LENGTH_LONG).show()
            in 95..100 -> Toast.makeText(this,"You Are ${EnumMarks.EXCILLENT}",Toast.LENGTH_LONG).show()
            else -> Toast.makeText(this,"Marks Out Of Bound",Toast.LENGTH_LONG).show()
        }
    }
}