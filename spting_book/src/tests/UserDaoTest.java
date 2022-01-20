import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import user.domain.User;
import user.dao.UserDao;

import java.sql.SQLException;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
@DirtiesContext
public class UserDaoTest {
    @Autowired
    private ApplicationContext context;
    private UserDao dao;
    private User user1;
    private User user2;
    private User user3;


    @Before
    public void setUp() {
        System.out.println("==================" + this.context);
        System.out.println("===================" + this);
        this.dao = context.getBean("userDao", UserDao.class);
        this.user1 = new User("user1", "asdf1", "asdf1");
        this.user2 = new User("user2", "asdfasdf2", "asdfw2");
        this.user3 = new User("user3", "asdfasdf2", "asdfw2");
    }

    @Test
    public void addAndGet() throws SQLException, ClassNotFoundException {
        dao.deleteAll();
        assertThat(dao.getCount(), is(0));

        dao.add(user1);
        dao.add(user2);
        dao.add(user3);

        assertThat(dao.getCount(), is(3));

        System.out.println(dao.get(user1.getId()));
    }

    @Test
    public void getAll() throws SQLException {
        dao.deleteAll();

        dao.add(user1);
        List<User> user1 = dao.getAll();
        assertThat(user1.size(), is(1));
        checkSameUser(user1, user1.get(0));

        dao.add(user2);
        List<User> user2 = dao.getAll();
        assertThat(user2.size(), is(2));
        checkSameUser(user1, user1.get(0));
        checkSameUser(user2, user2.get(1));

        dao.add(user3);
        List<User> user3 = dao.getAll();
        assertThat(user3.size(), is(3));
        checkSameUser(user1, user1.get(0));
        checkSameUser(user2, user1.get(1));
        checkSameUser(user3, user1.get(2));
    }
    private void checkSameUser(User user1,User user2){
        assertThat(user1.getId(),is(user2.getId()));
        assertThat(user2.getName(),is(user2.getName()));
        assertThat(user1.getPassword(),is(user2.getPassword()));
    }

    @Test
    public void count() throws SQLException, ClassNotFoundException {

        dao.deleteAll();
        assertThat(dao.getCount(), is(0));
        dao.add(user1);
        assertThat(dao.getCount(), is(1));
        dao.add(user2);
        assertThat(dao.getCount(), is(2));


    }

    @Test(expected = EmptyResultDataAccessException.class)
    public void getUserFailure() throws SQLException, ClassNotFoundException {
        dao.deleteAll();
        assertThat(dao.getCount(), is(0));

        dao.get("unknown_id");
    }


}