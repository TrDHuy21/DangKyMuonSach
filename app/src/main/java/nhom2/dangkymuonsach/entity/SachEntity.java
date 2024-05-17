package nhom2.dangkymuonsach.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;
import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity(tableName = "sach")
public class SachEntity {

    @PrimaryKey(autoGenerate = true)
    private Integer id;

    private String ten;

    private String gioiThieu;

    private String tacGia;

    private Date namXuatBan;

    private String nhaXuatBan;

    private int soLuongKho;

    private int soLuongCon;

    private float gia;

    private Set<TheLoaiEntity> theLoais;

    private Set<LoaiSachEntity> loaiSachs;
}
