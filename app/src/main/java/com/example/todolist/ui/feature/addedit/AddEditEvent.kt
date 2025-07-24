package com.example.todolist.ui.feature.addedit

interface AddEditEvent {
    data class TitleChanged(val title: String) : AddEditEvent
    data class DescriptionChanged(val description: String) : AddEditEvent
    object Save :  AddEditEvent
}