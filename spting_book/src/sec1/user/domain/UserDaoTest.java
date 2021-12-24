package sec1.user.domain;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    ConnectionMaker connectionMaker = new NConnectionMaker();

    UserDao dao = new UserDao(connectionMaker);
    }
}
