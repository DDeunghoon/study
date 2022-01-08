package sec1.user.domain;

import org.junit.Before;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.springframework.dao.EmptyResultDataAccessException;

import java.sql.SQLException;

public class UserDaoTest {
    private UserDao dao;
    private User user1;
    private User user2;
    private User user3;
    @Before
    public void setUp() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DaoFactory.class);
        this.dao = context.getBean("userDao", UserDao.class);
        this.user1 = new User("아이디1","이름1","비번1");
        this.user2 = new User("아이디2","이름2","비번2");
        this.user3 = new User("아이디3","이름3","비번3");
    }

    @Test
    public void addAndGet() throws SQLException, ClassNotFoundException {
        dao.deleteAll();
        assertThat(dao.getCount(), is(0));
        dao.deleteAll();

        dao.add(user1);
        dao.add(user2);
        assertThat(dao.getCount(), is(2));

        User userGet1 = dao.get(user1.getId());   //DB에는 저장이 되는데get을 통해서 가지고오면 nullpoint에러가 예외가 발생함
        System.out.println(userGet1.getPassword());
        assertThat(userGet1.getName(), is(user1.getName()));
        assertThat(userGet1.getPassword(), is(user1.getPassword()));

    }

    @Test
    public void count() throws SQLException, ClassNotFoundException {

        dao.deleteAll();
        assertThat(dao.getCount(), is(0));
        dao.add(user1);
        assertThat(dao.getCount(), is(1));
        dao.add(user2);
        assertThat(dao.getCount(), is(2));
        dao.add(user3);
        assertThat(dao.getCount(), is(3));

    }

    @Test(expected = EmptyResultDataAccessException.class)
    public void getUserFailure() throws SQLException, ClassNotFoundException {
        dao.deleteAll();
        assertThat(dao.getCount(), is(0));

        dao.get("unknown_id");
    }


}