package com.example.ap2_ex3.entities;
import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {MyUser.class}, version = 1)
public abstract class MyUserDB extends RoomDatabase{

    public abstract MyUserDao myUserDao();
}
