package com.plcoding.cleanarchitecturenoteapp.feature_source.data.repository

import com.plcoding.cleanarchitecturenoteapp.feature_source.data.data_source.NoteDao
import com.plcoding.cleanarchitecturenoteapp.feature_source.domain.model.Note
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val dao: NoteDao
): NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNote()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }

}