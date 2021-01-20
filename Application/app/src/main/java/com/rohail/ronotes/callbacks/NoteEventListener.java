package com.rohail.ronotes.callbacks;

import com.rohail.ronotes.model.Note;

/**
 * Created by Rohail on 28/11/2020.
 */
public interface NoteEventListener {
    /**
     * call when note selected.
     */
    void onNoteClick(Note note);

    /**
     * call wen long pressed note.
     */
    void onNoteLongClick(Note note);
}
