package nhom2.dangkymuonsach.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import nhom2.dangkymuonsach.entity.SachEntity;
import nhom2.dangkymuonsach.entity.UserEntity;

@Dao
public interface SachDAO {
    @Insert
    public void insert(SachEntity sachEntity);
    @Update
    public void update(SachEntity sachEntity);
    @Delete
    public void delete(SachEntity sachEntity);

    @Query("SELECT * FROM sach")
    public List<SachEntity> getAll();

    @Query("SELECT * FROM user WHERE id = :id")
    public SachEntity getById(Integer id);
}
