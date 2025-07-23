package com.example.todolist.domain

data class Todo (
    val id: Long,
    val title: String,
    val description: String?,
    val isCompleted: Boolean
)

// objetos falaços
val todo1 = Todo(
    id = 1,
    title = "Pagar conta de Luz",
    description = "Ir na lotérica",
    isCompleted = false
)

val todo2 = Todo(
    id = 2,
    title = "Pagar conta de Gas",
    description = "Nã há nada aqui",
    isCompleted = true
)

val todo3 = Todo(
    id = 3,
    title = "Comprar bananas",
    description = "",
    isCompleted = false
)