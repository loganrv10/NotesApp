package com.example.noteapp.ui

import android.app.Application
import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.noteapp.model.repo.NotesRepository
import com.example.noteapp.model.room.Notes
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class NotesViewModel(private val repository: NotesRepository) : ViewModel() {

    init {
        repository.getAllNotes()
    }

    fun insertNote(note: Notes) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertNote(note)
        }
    }

    fun updateNote(note: Notes) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateNote(note)
        }
    }

    fun deleteNote(note: Notes) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteNote(note)
        }

    }

}