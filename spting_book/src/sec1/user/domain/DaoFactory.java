package sec1.user.domain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {
    @Bean
    public UserDao userDao() {
        UserDao userDao = new UserDao();
        userDao.setConnectionMaker(connectionMaker());
        return userDao;
    }
    @Bean   // ============== <bean
    public ConnectionMaker
    connectionMaker(){ // ==============  id = "connectionMaker"
        return new NConnectionMaker(); // ============== class="sec1.user.domain.NConnectionMaker" />
    }
}
