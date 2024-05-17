package nhom2.dangkymuonsach.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
@Entity(tableName = "loai_sach")
public class LoaiSachEntity {

    @PrimaryKey(autoGenerate = true)
    private Integer id;

    private String ten;

    private Set<SachEntity> sachs;

}
