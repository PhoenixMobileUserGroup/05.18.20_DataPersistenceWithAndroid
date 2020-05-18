package com.neudesic.todo.feature.add.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.neudesic.todo.data.TodoDatabase
import com.neudesic.todo.data.TodoRepository
import com.neudesic.todo.model.Todo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.joda.time.LocalDate

class AddTodoViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: TodoRepository

    init {
        val dao = TodoDatabase.getDatabase(application).todoDao()
        repository = TodoRepository(dao)
    }

    fun save(title: String, description: String, dueDate: LocalDate) {
        val todo = Todo(title = title, description = description, dueDate = dueDate)
        insert(todo)
    }

    private fun insert(todo: Todo) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(todo)
    }
}