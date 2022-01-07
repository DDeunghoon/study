package sec1.user.domain;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;


import java.sql.SQLException;

public class UserDaoTest {
    @Test
    public void addAndGet() throws SQLException, ClassNotFoundException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao = context.getBean("userDao", UserDao.class);
        dao.deleteAll();
        assertThat(dao.getCount(), is(0));
        User user = new User();
        user.setId("spring1");
        user.setName("노성훈1");
        user.setPassword("1234");
        dao.add(user);
        assertThat(dao.getCount(), is(1));
        User user2 = dao.get(user.getId());
        System.out.println("등록 성공!! = " + user2.getId());
        System.out.println("이름 :"+user2.getName());
        System.out.println("ID:"+user2.getId());
        System.out.println("password"+user2.getPassword());
        assertThat(user.getName(), is(user2.getName()));
        assertThat(user.getPassword(), is(user2.getPassword()));
    }
    @Test
    public void count() throws SQLException{

    }
}