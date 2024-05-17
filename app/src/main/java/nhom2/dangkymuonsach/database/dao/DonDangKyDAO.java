package nhom2.dangkymuonsach.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import nhom2.dangkymuonsach.entity.DonDangKyEntity;

@Dao
public interface DonDangKyDAO {
    @Insert
    public void insert(DonDangKyEntity donDangKyEntity);
    @Update
    public void update(DonDangKyEntity donDangKyEntity);
    @Delete
    public void delete(DonDangKyEntity donDangKyEntity);

    @Query("SELECT * FROM don_dang_ky")
    public List<DonDangKyEntity> getAll();

    @Query("SELECT * FROM don_dang_ky WHERE id = :id")
    public DonDangKyEntity getById(Integer id);
}
