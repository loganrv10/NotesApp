package com.example.noteapp.model.repo

import com.example.noteapp.model.room.Notes
import com.example.noteapp.model.room.NotesDao

class NotesRepositoryImpl(private val dao: NotesDao) : NotesRepository {

    override fun getAllNotes() {
        dao.getAllNotes()
    }

    override suspend fun insertNote(note: Notes) {
        dao.createNote(note)
    }

    override suspend fun updateNote(note: Notes) {
        dao.updateNote(note)
    }

    override suspend fun deleteNote(note: Notes) {
        dao.deleteNote(note)
    }


}