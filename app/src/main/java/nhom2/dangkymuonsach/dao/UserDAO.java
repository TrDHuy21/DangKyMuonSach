package nhom2.dangkymuonsach.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import nhom2.dangkymuonsach.entity.UserEntity;

@Dao
public interface UserDAO {
    @Insert
    public void insert(UserEntity userEntity);
    @Update
    public void update(UserEntity userEntity);
    @Delete
    public void delete(UserEntity userEntity);

    @Query("SELECT * FROM user")
    public List<UserEntity> getAll();

    @Query("SELECT * FROM user WHERE id = :id")
    public UserEntity getById(Integer id);
}
