public class User {

    private String userEmail;
    private String password;
    private String nickName;
    private String phoneNumber;

    public User(String userEmail, String password, String nickName, String phoneNumber) {
        setUserEmail(userEmail);
        setPassword(password);
        setNickName(nickName);
        setPhoneNumber(phoneNumber);
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        if (userEmail.contains("@")) {
            this.userEmail = userEmail;
        } else {
            throw new RuntimeException("이메일에 @가 없습니다");
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith("010")) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new RuntimeException("phoneNumber 유효하지 않습니다");
        }

    }

    @Override
    public String toString() {
        return "User{" +
                "이메일 ='" + userEmail + '\'' +
                ", 비밀번호 ='" + password + '\'' +
                ", 닉네임 ='" + nickName + '\'' +
                ", 핸드폰 번호 ='" + phoneNumber + '\'' +
                '}';
    }

}
