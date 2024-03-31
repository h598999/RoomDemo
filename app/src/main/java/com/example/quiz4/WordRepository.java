package com.example.quiz4;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class WordRepository {
    private WordDao mWordDao;
    private LiveData<List<Word>> mAllWords;

    WordRepository(Application application){
        WordRoomDatabase db = WordRoomDatabase.getDatabase(application);
        mWordDao = db.worddao();
        mAllWords = mWordDao.getAlphabetizedWord();
    }

    LiveData<List<Word>> getAllWords(){
        return mAllWords;
    }

    void insert(Word word){
        WordRoomDatabase.databaseWriterExecutor.execute(() -> {
            mWordDao.insert(word);
        });
    }
}
