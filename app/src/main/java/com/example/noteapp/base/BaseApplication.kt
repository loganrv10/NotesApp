package com.example.noteapp.base

import android.app.Application
import com.example.noteapp.model.room.NotesDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication : Application() {

    private val database by lazy { NotesDatabase.getInstance(this) }
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@BaseApplication)
        }
    }
}