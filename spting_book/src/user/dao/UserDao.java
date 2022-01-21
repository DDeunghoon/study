package user.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import user.domain.StatementStrategy;
import user.domain.User;

import javax.sql.DataSource;


public class UserDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private JdbcContext jdbcContext;


    public void setDataSource(DataSource dataSource) {
        this.jdbcContext = new JdbcContext();
        this.jdbcContext.setDataSource(dataSource);
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.dataSource = dataSource;

    }

    public void add(final User user) throws SQLException {
        this.jdbcTemplate.update("insert into users(id,name,password) value(?,?,?)",
                user.getId(), user.getName(), user.getPassword());
    }

    public User get(String id) throws SQLException {
       return this.jdbcTemplate.queryForObject("select * from users where id = ?",
               new Object[]{id},
               new RowMapper<User>() {
                   @Override
                   public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                       User user = new User();
                       user.setId(rs.getString("id"));
                       user.setName(rs.getString("name"));
                       user.setPassword(rs.getString("password"));
                       return user;
                   }
               });

    }

    public void deleteAll() throws SQLException {
        this.jdbcTemplate.update("Delete from users");
    }


    public int getCount() throws SQLException {
        return this.jdbcTemplate.queryForInt("select count(*) from users");
    }

    public List<User> getAll() {
        return this.jdbcTemplate.query("select * from users order by id",
                new RowMapper<User>() {
                    @Override
                    public User mapRow(ResultSet rs, int rowNUm) throws SQLException {
                        User user = new User();
                        user.setId(rs.getString("id"));
                        user.setName(rs.getString("name"));
                        user.setPassword(rs.getString("password"));
                        return user;
                    }
                });
    }
}



