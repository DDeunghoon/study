package sec1.user.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao = context.getBean("userDao", UserDao.class);
        //User user = new User();
//        user.setId("spring");
//        user.setName("노성훈");
//        user.setPassword("123");
//        dao.add(user);
        DaoFactory factory = new DaoFactory();

        UserDao dao1 = factory.userDao();
        UserDao dao2 = factory.userDao();
        System.out.println(dao1);
        System.out.println(dao2);
        //출력값
        // sec1.user.domain.UserDao@553f17c
        //sec1.user.domain.UserDao@4f7d0008
        ApplicationContext context1 = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao3 = context1.getBean("userDao", UserDao.class);
        UserDao dao4 = context1.getBean("userDao", UserDao.class);
        System.out.println(dao3);
        System.out.println(dao4);
//        출력
//        sec1.user.domain.UserDao@7085bdee
//        sec1.user.domain.UserDao@7085bdee


    }
}
