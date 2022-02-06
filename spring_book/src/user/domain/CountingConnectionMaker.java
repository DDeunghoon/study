package user.domain;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class CountingConnectionMaker implements ConnectionMaker{
    int counter = 0;
    private DataSource realConnectionMaker;

    public CountingConnectionMaker(DataSource realConnectionMaker) {
        this.realConnectionMaker = realConnectionMaker;
    }

    public Connection makeConnection() throws ClassNotFoundException,SQLException{
        this.counter++;
        return realConnectionMaker.getConnection();
    }
    public int getCounter(){
        return this.counter;
    }
}
