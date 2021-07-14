package phone;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PhoneTimeUtil {
    public static String getCuurentTimeAsString() {
        String pattern = "yyyy년 MM월 dd일 HH시mm분 ";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(new Date());
    }

}
