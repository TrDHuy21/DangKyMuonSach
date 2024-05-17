package nhom2.dangkymuonsach.database.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import nhom2.dangkymuonsach.database.AppDatabase;
import nhom2.dangkymuonsach.database.dao.UserDAO;
import nhom2.dangkymuonsach.entity.UserEntity;

public class UserRepository {
    private Application app;
    private UserDAO userDAO;

    public UserRepository(Application app) {
        this.app=app;
        userDAO = AppDatabase.getAppDatabase(app).getUserDAO();
    }

    public Completable insert(UserEntity userEntity) {
        return userDAO.insert(userEntity);
    }

    public Completable update(UserEntity userEntity) {
        return userDAO.update(userEntity);
    }

    public Completable delete(UserEntity userEntity) {
        return userDAO.delete(userEntity);
    }

    public LiveData<List<UserEntity>> getAll(){
        return userDAO.getAll();
    }

    public LiveData<UserEntity> getById(Integer id){
        return userDAO.getById(id);
    }
}
