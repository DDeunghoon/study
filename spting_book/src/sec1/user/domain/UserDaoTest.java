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
        System.out.println("이름 :" + user2.getName());
        System.out.println("ID:" + user2.getId());
        System.out.println("password" + user2.getPassword());
        System.out.println("테이블 개수 " + dao.getCount());
        assertThat(user.getName(), is(user2.getName()));
        assertThat(user.getPassword(), is(user2.getPassword()));
    }

    @Test
    public void count() throws SQLException ,ClassNotFoundException{
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao = context.getBean("userDao", UserDao.class);
        User user1 = new User("아이디1", "이름1", "비번1");
        User user2 = new User("아이디2", "이름2", "비번2");
        User user3 = new User("아이디3", "이름3", "비번3");
        User user4 = new User("아이디4", "이름4", "비번4");

        dao.deleteAll();
        assertThat(dao.getCount(),is(0));
        dao.add(user1);
        assertThat(dao.getCount(),is(1));
        dao.add(user2);
        assertThat(dao.getCount(),is(2));
        dao.add(user3);
        assertThat(dao.getCount(),is(3));
        dao.add(user4);
        assertThat(dao.getCount(),is(4));
        }
}