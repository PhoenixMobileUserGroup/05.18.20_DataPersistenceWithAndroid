package com.neudesic.todo.feature.add.ui

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.textfield.TextInputEditText
import com.neudesic.todo.R
import com.neudesic.todo.feature.add.viewmodel.AddTodoViewModel
import kotlinx.android.synthetic.main.activity_add_todo.*
import org.joda.time.LocalDate
import org.joda.time.format.DateTimeFormat
import java.time.format.DateTimeFormatter

class AddTodoActivity : AppCompatActivity() {

    private lateinit var viewmodel: AddTodoViewModel
    private lateinit var saveButton: Button
    private lateinit var dueDate: TextInputEditText
    private lateinit var description: TextInputEditText
    private lateinit var title: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_todo)

        saveButton = findViewById(R.id.save)
        dueDate = findViewById(R.id.due_date)
        description = findViewById(R.id.description)
        title = findViewById(R.id.title)

        save.setOnClickListener {
            onSave()
        }

        viewmodel = ViewModelProvider(this)[AddTodoViewModel::class.java]

    }

    private fun onSave() {
        val formatter = DateTimeFormat.forPattern("MM/dd/YYYY")
        viewmodel.save(title.text.toString(), description.text.toString(), formatter.parseLocalDate(dueDate.text.toString()))
        Toast.makeText(this, "Todo Saved!", Toast.LENGTH_SHORT).show()
    }
}