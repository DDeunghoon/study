import java.util.ArrayList;

public class UserService {
    private ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public User create(String userEmail, String password, String nickName, String phoneNumber) throws RuntimeException {
        User user = new User(userEmail, password, nickName, phoneNumber);
        users.add(user);
        return user;
    }

    public void deleteUser(String phoneNumber) {

        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getPhoneNumber().equals(phoneNumber)) {
                users.remove(user);
            } else {
                throw new RuntimeException("삭제하려는 유저의 정보가 유효하지 않습니다 ");
            }
        }
    }

    public void changePhoneNumber(String phoneNumber, String changePhoneNumber) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getPhoneNumber().equals(phoneNumber)) {
                user.setPhoneNumber(changePhoneNumber); // 셋이아니라 체인지폰넘버를 만들어야함
            } else {
                throw new RuntimeException("존재하지 않는 핸드폰 번호입니다 ");
            }
        }
    }


}
