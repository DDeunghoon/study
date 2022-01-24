package user.dao;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import user.domain.User;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class UserDaoJdbc implements UserDao {
    private JdbcTemplate jdbcTemplate;
    private RowMapper<User> userMapper =
            new RowMapper<User>() {
                @Override
                public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                    User user = new User();
                    user.setId(rs.getString("id"));
                    user.setName(rs.getString("name"));
                    user.setPassword(rs.getString("password"));
                    return user;
                }
            };



    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);

    }

    public void add(final User user)  {
        this.jdbcTemplate.update("insert into users(id,name,password) value(?,?,?)",
                user.getId(), user.getName(), user.getPassword());
    }

    public User get(String id)  {
       return this.jdbcTemplate.queryForObject("select * from users where id = ?",
               new Object[]{id},this.userMapper
               );

    }

    public void deleteAll()  {
        this.jdbcTemplate.update("Delete from users");
    }


    public int getCount()  {
        return this.jdbcTemplate.queryForInt("select count(*) from users");
    }

    public List<User> getAll() {
        return this.jdbcTemplate.query("select * from users order by id",this.userMapper);
    }
}



