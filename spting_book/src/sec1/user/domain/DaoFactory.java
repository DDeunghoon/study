package sec1.user.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

@Configuration
public class DaoFactory {
    @Bean
    public UserDao userDao() {
        UserDao userDao = new UserDao();
        userDao.setConnectionMaker(dataSource());
        return userDao;
    }

    @Bean                               //xml로 변경
    public DataSource dataSource() { //<bean id="dataSource" class ="sec1.user.domain.SimpleDriverDataSource">
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource(); //SimpleDriverDataSource 를 생성은 할 수 있지만 .set~부분은 추가할 수가 없다 이때

        dataSource.setDriverClass(com.mysql.jdbc.Driver.class); //<bean id="dataSource" class ="sec1.user.domain.SimpleDriverDataSource">
        dataSource.setUrl("jdbc:mysql://localhost/spring"); //<property name="diverClass" value="com.mysql.jdbc.Driver"/> class부분 생략 타입변환을 해줌
        dataSource.setUsername("root"); //<property name="url" value="jdbc:mysql://localhost/spring"/>
        dataSource.setPassword("qsc20215"); //property name="password" value="qsc20215"/>
        return dataSource;
    }






}
