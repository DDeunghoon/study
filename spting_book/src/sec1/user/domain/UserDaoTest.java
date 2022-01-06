package sec1.user.domain;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.runner.JUnitCore;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) {
    JUnitCore.main("sec1.user.domain.UserDaoTest");
    }
    @Test
    public void addAndGet() throws SQLException, ClassNotFoundException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao = context.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId("spring1");
        user.setName("노성훈1");
        user.setPassword("1234");
        dao.add(user);

        User user2 = dao.get(user.getId());
        System.out.println("등록 성공!! = " + user2.getId());
        assertThat(user.getName(), is(user2.getName()));
        assertThat(user.getPassword(), is(user2.getPassword()));

    }
}