package com.example.noteapp.model.repo

import com.example.noteapp.model.room.Notes

interface NotesRepository {

    fun getAllNotes()

    suspend fun insertNote(note: Notes)

    suspend fun updateNote(note: Notes)

    suspend fun deleteNote(note: Notes)


}