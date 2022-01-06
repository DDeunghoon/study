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

        User user2 = dao.get(user.getId());
        System.out.println("등록 성공!! = "+user2.getId());
        if (!user.getName().equals(user2.getName())){
            System.out.println("테스트 실패!");
        }
        if (!user.getPassword().equals(user2.getPassword())) {
            System.out.println("테스트 실패!");
        }
        else {
        System.out.println("조회 성공");}

    }
}
