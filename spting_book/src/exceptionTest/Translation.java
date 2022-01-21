package exceptionTest;

import com.mysql.cj.exceptions.MysqlErrorNumbers;

import java.sql.SQLException;

public class Translation {
    public void add(User user) throws DuplecateUserIdException, SQLException {
        try {
            //JDBC를 이용해 user 정보를 DB에 추가하는 코드
            //또는 그런 기능을 가진 다른 SQLException을 던지는 메소드를 호춣하는 코드
        } catch (SQLException) {
            //에러코드가 sql의 "Duplicate Entry(1062) 라면 예외 전환
            if (e.getErrorCode() == MysqlErrorNumbers.ER_DUP_ENTRY) {
                throw DuplicateUserIdException();
            } else {
                //그 외의 경우에는 SQLException을 그대로 던진다 
                throw e;
            }
        }
    }
}
