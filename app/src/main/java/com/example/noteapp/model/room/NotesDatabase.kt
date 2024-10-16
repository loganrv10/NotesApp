package com.example.noteapp.model.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Notes::class], version = 1, exportSchema = false)
abstract class NotesDatabase : RoomDatabase() {
    abstract fun notesDao(): NotesDao
    private var INSTANCE: NotesDatabase? = null
    fun getInstance(context: Context): NotesDatabase{
       synchronized(this) {
            if (INSTANCE == null) {
                INSTANCE =
                    Room.databaseBuilder(context, NotesDatabase::class.java,
                        "notes_database").build()
            }
        }
        return INSTANCE!!
    }
    }