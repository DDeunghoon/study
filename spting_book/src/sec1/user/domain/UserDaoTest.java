package sec1.user.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao = context.getBean("userDao",UserDao.class);
        User user = new User();
        user.setId("spring");
        user.setName("노성훈");
        user.setPassword("123");
        dao.add(user);

        System.out.println("등록성공 :"+dao.get(user.getId()));
    }
}
