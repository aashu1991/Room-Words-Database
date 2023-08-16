package com.roomwordssample;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface WordDao {

    @Insert
    void insert(Word word);

    @Query("SELECT * from word_table ORDER BY word ASC")
    LiveData<List<Word>> getAllWords();

    // For Delete
    @Query("SELECT * from word_table LIMIT 1")
    Word[] getAnyWord();

    @Query("DELETE FROM word_table")
    void deleteAll();

    // For Delete Single word
    @Delete
    void deleteWord(Word word);
}