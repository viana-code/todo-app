package com.example.todolist.ui.feature

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todolist.domain.Todo
import com.example.todolist.domain.todo1
import com.example.todolist.domain.todo2
import com.example.todolist.domain.todo3
import com.example.todolist.ui.components.TodoItem
import com.example.todolist.ui.theme.TodoListTheme

@Composable
fun ListScreen() {
    
}

@Composable
fun ListContent(
    todos: List<Todo>,
    modifier: Modifier = Modifier
    ) {
    Scaffold (
        floatingActionButton = {
            FloatingActionButton(onClick = { }) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .consumeWindowInsets(it),
            contentPadding = PaddingValues(16.dp)
        ) {
            items(todos) {todo ->
                TodoItem(
                    todo = todo,
                    onItemClick = {},
                    onCompletedChange = {},
                    onDeleteItem = {}
                )
            }
        }
    }
}

@Preview
@Composable
private fun ListContentPreview() {
    TodoListTheme {
        ListContent(todos = listOf(todo1, todo2, todo3))
    }
}