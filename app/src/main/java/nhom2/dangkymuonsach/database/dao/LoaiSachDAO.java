package nhom2.dangkymuonsach.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import nhom2.dangkymuonsach.entity.LoaiSachEntity;
import nhom2.dangkymuonsach.entity.UserEntity;

@Dao
public interface LoaiSachDAO {
    @Insert
    public void insert(LoaiSachEntity loaiSachEntity);
    @Update
    public void update(LoaiSachEntity loaiSachEntity);
    @Delete
    public void delete(LoaiSachEntity loaiSachEntity);

    @Query("SELECT * FROM loai_sach")
    public List<LoaiSachEntity> getAll();

    @Query("SELECT * FROM user WHERE id = :id")
    public LoaiSachEntity getById(Integer id);
}
