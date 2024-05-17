package nhom2.dangkymuonsach.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import nhom2.dangkymuonsach.dao.UserDAO;
import nhom2.dangkymuonsach.entity.UserEntity;

@Database(entities = {UserEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDAO getUserDAO();
}
