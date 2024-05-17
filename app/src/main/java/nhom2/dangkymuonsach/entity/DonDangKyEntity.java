package nhom2.dangkymuonsach.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity(tableName = "don_dang_ky")
public class DonDangKyEntity {
    @PrimaryKey(autoGenerate = true)
    private UserEntity user;

    private SachEntity sach;

    private UserEntity nguoiDuyet;

    private Date ngayBatDau;

    private Date ngayKetThuc;

    private int trangThai;

}
