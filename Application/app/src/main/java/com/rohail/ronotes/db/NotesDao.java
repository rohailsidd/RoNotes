package com.rohail.ronotes.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.rohail.ronotes.model.Note;

import java.util.List;

/**
 * Created by Rohail on 28/11/2020.
 */
@Dao
public interface NotesDao {
    /**
     * Insert and save note to Database
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertNote(Note note);

    /**
     * Delete note
     */
    @Delete
    void deleteNote(Note... note);

    /**
     * Update note
     */
    @Update
    void updateNote(Note note);

    /**
     * List All Notes From Database
     */
    @Query("SELECT * FROM notes")
    List<Note> getNotes();

    /**
     * @return Note
     */
    @Query("SELECT * FROM notes WHERE id = :noteId")
    Note getNoteById(int noteId);



}
