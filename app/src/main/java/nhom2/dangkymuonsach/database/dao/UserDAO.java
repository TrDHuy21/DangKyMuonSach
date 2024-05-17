package nhom2.dangkymuonsach.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import nhom2.dangkymuonsach.entity.UserEntity;

@Dao
public interface UserDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public Completable insert(UserEntity userEntity);

    @Update
    public Completable  update(UserEntity userEntity);

    @Delete
    public Completable  delete(UserEntity userEntity);

    @Query("SELECT * FROM user")
    public LiveData<List<UserEntity>> getAll();

    @Query("SELECT * FROM user WHERE id = :id")
    public LiveData<UserEntity> getById(Integer id);
}
