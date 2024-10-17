package com.example.noteapp.di

import com.example.noteapp.model.repo.NotesRepositoryImpl
import com.example.noteapp.model.room.NotesDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import org.koin.dsl.module




val module = module {
    single { NotesRepositoryImpl(get()) } }