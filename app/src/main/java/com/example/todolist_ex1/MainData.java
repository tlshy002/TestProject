
//데이터베이스 모델
package com.example.todolist_ex1;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "table_name")
public class MainData implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int id;
    //
    //private Boolean isChecked;

    @ColumnInfo(name = "text")
    private String text;

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    public String getText() { return text;}
    public void setText(String text)
    {
        this.text = text;
    }

    //
    //public Boolean getIsChecked() { return isChecked; }
    //public void setIsChecked(Boolean checked) { isChecked = checked; }


}
