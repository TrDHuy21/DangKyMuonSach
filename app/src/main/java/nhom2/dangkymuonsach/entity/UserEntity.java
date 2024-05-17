package nhom2.dangkymuonsach.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity(tableName = "user")
public class UserEntity {

    @PrimaryKey(autoGenerate = true)
    private Integer id;

    private String userName;

    private String password;

    private String ho;

    private String ten;

    private String role;
}
