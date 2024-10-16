package com.example.noteapp.model.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface NotesDao {

   @Insert
   suspend fun createNote(note: Notes)
    
    @Update
    suspend fun updateNote(note: Notes)
    
    @Delete
    suspend fun deleteNote(note: Notes)
    
    @Query("SELECT * FROM notes")
    fun getAllNotes(): LiveData<List<Notes>>
}


//here to use live data or mutable live data prakash