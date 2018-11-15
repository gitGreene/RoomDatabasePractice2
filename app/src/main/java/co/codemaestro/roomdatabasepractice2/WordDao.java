package co.codemaestro.roomdatabasepractice2;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface WordDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Word word);

    @Query("DELETE FROM time_table")
    void deleteAll();

    @Query("SELECT * from time_table")
    LiveData<List<Word>> getAllWords();

    @Update
    void updateTimeValue(Word word);
}
