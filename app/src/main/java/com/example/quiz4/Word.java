package com.example.quiz4;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.jetbrains.annotations.NonNls;

@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")

    private String mWord;
    public Word(@NonNull String word) {this.mWord = word;}

    public String getWord() {return this.mWord;}

}
