package sec1.user.domain;

import java.sql.*;

public class UserDao {
//현재는 곂치는 코드가 많고 커넥션을 계속해서 생성한다 관심사를 분리해야함
    public static void main(String[] args) throws ClassNotFoundException,SQLException {
        UserDao dao = new UserDao();

        User user = new User();
        user.setId("springId");
        user.setName("노성훈");
        user.setPassword("123");

        dao.add(user);

        System.out.println(user.getId() + "등록성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + "조회성공");
    }

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

    public User get(String id) throws ClassNotFoundException,SQLException{
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(
                "select * from users where id = ?");
        ps.setString(1,id);

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
    private Connection getConnection() throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost/spring","root","qsc20215");
        return c;
    }
}
