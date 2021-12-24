package sec1.user.domain;

import java.sql.*;

public abstract class UserDao {
    private ConnectionMaker connectionMaker;

    public UserDao() {
        connectionMaker = new NConnectionMaker();  //다른클레스에 종속됨
    }

    public void add(User user) throws ClassNotFoundException, SQLException {
        Connection c = connectionMaker.makeConnection(); //인터페이스에 정의된걸 사용해서 클래스가 바뀌어도 메소도이름이 변경될 걱정은없다
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
        Connection c = connectionMaker.makeConnection();
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
}

class NUserDao extends UserDao {
    //N사 커넥션 재정의 상속을 통해서 다른 다른 커넥션을 쓰고 공통된 기능을 사용할수있다
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost/spring", "root", "qsc20215");
        return c;
    }
}

