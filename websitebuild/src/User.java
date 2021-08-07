public class User {

    private String name;
    private String id;
    private String password;
    private String phoneNumber;
    private String nickName;

    public User(String name, String id, String password, String phoneNumber, String nickName) {
    setName(name);
    setId(id);
    setPassword(password);
    setPhoneNumber(phoneNumber);
    setNickName(nickName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.contains("010")) {
            this.phoneNumber = phoneNumber;
        }else{
            new RuntimeException("유효하지 않은 전화번호입니다");
        }
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
