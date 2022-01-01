package sec1.user.domain;

import java.sql.*;

public class UserDao {
    private ConnectionMaker connectionMaker;


    public UserDao() { //의존관계 검색과 주입 방법
        DaoFactory daoFactory = new DaoFactory();  //스스로 DaoFactory에게 요청을 보냄  외부로부터 주입받지 않음 
        this.connectionMaker = daoFactory.connectionMaker();  //인덱스만 알고있으면 된다
    }


    //    public UserDao(ConnectionMaker connectionMaker) {
//        this.connectionMaker = connectionMaker;
//    }

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


