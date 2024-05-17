package nhom2.dangkymuonsach.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import nhom2.dangkymuonsach.entity.TheLoaiEntity;
import nhom2.dangkymuonsach.entity.UserEntity;

@Dao
public interface TheLoaiDAO {
    @Insert
    public void insert(TheLoaiEntity theLoaiEntity);
    @Update
    public void update(TheLoaiEntity theLoaiEntity);
    @Delete
    public void delete(TheLoaiEntity theLoaiEntity);

    @Query("SELECT * FROM the_loai")
    public List<TheLoaiEntity> getAll();

    @Query("SELECT * FROM user WHERE id = :id")
    public TheLoaiEntity getById(Integer id);
}
