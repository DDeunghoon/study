package sec1.user.domain;

import java.sql.*;

public abstract class UserDao {

    public void add(User user) throws ClassNotFoundException, SQLException {
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(
                "insert into users(id,name,password) values(?,?,?)");
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        ps.executeUpdate();

        ps.close();
        c.close();
    }

    public User get(String id) throws ClassNotFoundException, SQLException {
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(
                "select * from users where id = ?");
        ps.setString(1, id);

        ResultSet rs = ps.executeQuery();
        rs.next();
        User user = new User();
        user.setId(rs.getString("id"));
        user.setName(rs.getString("name"));
        user.setPassword(rs.getString("password"));

        rs.close();
        ps.close();
        c.close();

        return user;

    }

    public abstract Connection getConnection() throws ClassNotFoundException, SQLException;
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection c = DriverManager.getConnection(
//                "jdbc:mysql://localhost/spring","root","qsc20215");
//        return c;
}

class NUserDao extends UserDao {
    //N사 커넥션 재정의 상속을 통해서 다른 다른 커넥션을 쓰고 공통된 기능을 사용할수있다
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost/spring", "root", "qsc20215");
        return c;
    }
    //테스트 코드 
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        NUserDao nUserDao = new NUserDao();
        User user = new User();
        user.setId("springId");
        user.setName("노성훈");
        user.setPassword("123");

        nUserDao.add(user);

        System.out.println(user.getId() + "등록성공");

        User user2 = nUserDao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + "조회성공");
    }

}

class DUserDao extends UserDao {
    //D사 커넥션 재정의 상속을 통해서 다른 다른 커넥션을 쓰고 공통된 기능을 사용할수있다
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost/spring", "root", "qsc20215");
        return c;
    }
}
