//package sec1.user.domain;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.SimpleDriverDataSource;
//
//
//import javax.sql.DataSource;
//
//@Configuration
//public class CountingDaoFactory {
//
//
//    @Bean
//    public UserDao userDao() {
//        UserDao userDao = new UserDao();
//        userDao.setConnectionMaker(dataSource());
//        return userDao();
//    }
//
//
//    @Bean
//    public DataSource dataSource(){
//        return realConnection().getConnection();
//    } //DI 방식을 적용하면 여기부분을 변경하는것만으로도 db를 변경할수있다
//
//    //효율이 높아짐
//    @Bean
//    public DataSource realConnection() {
//        return new D
//    }
//}

