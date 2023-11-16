package com.plcoding.cleanarchitecturenoteapp.feature_source.data.repository

import com.plcoding.cleanarchitecturenoteapp.feature_source.domain.model.Note
import kotlinx.coroutines.flow.Flow


interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}