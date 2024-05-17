package nhom2.dangkymuonsach.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import nhom2.dangkymuonsach.database.dao.UserDAO;
import nhom2.dangkymuonsach.entity.UserEntity;

@Database(entities = {UserEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    static volatile AppDatabase INSTANCE;

    public static AppDatabase getAppDatabase(Context context) {
        if (INSTANCE == null) {
            synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    AppDatabase.class, "Sample.db")
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    public abstract UserDAO getUserDAO();

}
