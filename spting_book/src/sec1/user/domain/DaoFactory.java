package sec1.user.domain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {
    @Bean
    public UserDao userDao() {   // = <bean
        UserDao userDao = new UserDao(); //= class="sec1.user.domain.UserDao" >
        userDao.setConnectionMaker(connectionMaker()); // <property name="connectionMaker" ref="connectionMaker" />
        return userDao; //</bean>
    }
    @Bean   // ============== <bean
    public ConnectionMaker
    connectionMaker(){ // ==============  id = "connectionMaker"
        return new NConnectionMaker(); // ============== class="sec1.user.domain.NConnectionMaker" />
    }
}
