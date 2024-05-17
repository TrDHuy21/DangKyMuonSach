package nhom2.dangkymuonsach;

import android.content.Context;

import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import nhom2.dangkymuonsach.database.dao.UserDAO;
import nhom2.dangkymuonsach.database.AppDatabase;
import nhom2.dangkymuonsach.entity.UserEntity;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    private AppDatabase appDatabase;
    private UserDAO userDAO;
    Context appContext;
    @Before
    public void setup() {
        appContext = ApplicationProvider.getApplicationContext();
        appDatabase = Room.inMemoryDatabaseBuilder(
                appContext,
                AppDatabase.class
        ).allowMainThreadQueries().build();
        userDAO = appDatabase.getUserDAO();
    }

    @After
    public void cleanup() {
        appDatabase.close();
    }
    @Test
    public void useAppContext() {
//        UserEntity entity = new UserEntity();
//        entity.setTen("Test");
//        userDAO.insert(entity);
//        System.out.println(appDatabase.toString());
//        UserEntity retrievedEntity = userDAO.getById(entity.getId());
//        assertNotNull(retrievedEntity);
//        assertEquals(entity.getTen(), retrievedEntity.getTen());
        assertEquals(4, 2 + 2);
        // Context of the app under test.
        assertEquals("nhom2.dangkymuonsach", appContext.getPackageName());


//        assertEquals("nhom2.dangkymuonsach", appContext.getPackageName());
    }
}