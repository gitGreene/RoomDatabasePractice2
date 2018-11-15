package co.codemaestro.roomdatabasepractice2;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "time_table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "title")
    private String mTimeBankTitle;

    @ColumnInfo(name = "value")
    private String mTimeBankValue;

    public Word(String mTimeBankTitle, String mTimeBankValue) {
        this.mTimeBankTitle = mTimeBankTitle;
        this.mTimeBankValue = mTimeBankValue;
    }

    public Word(){

    }

    public String getTimeBankTitle(){
        return this.mTimeBankTitle;
    }

    public String getTimeBankValue() {
        return this.mTimeBankValue;
    }

    public void setTimeBankTitle(@NonNull String mTimeBankTitle) {
        this.mTimeBankTitle = mTimeBankTitle;
    }

    public void setTimeBankValue(String mTimeBankValue) {
        this.mTimeBankValue = mTimeBankValue;
    }
}
