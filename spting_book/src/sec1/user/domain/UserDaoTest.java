package sec1.user.domain;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao = context.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId("spring");
        user.setName("노성훈");
        user.setPassword("123");
        dao.add(user);
        DaoFactory factory = new DaoFactory();
    }
}
