import java.util.ArrayList;

public class UserController {

    private UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    public User create(String userEmail, String password, String nickName, String phoneNUmber) {
        return userService.create(userEmail, password, nickName, phoneNUmber);
    }

    public ArrayList<User> getUsers() {
        return userService.getUsers();
    }

    public void deleteUser(String phoneNumber) {
        userService.deleteUser(phoneNumber);
    }
    public void changePhoneNumber(String phoneNumber, String changePhoneNumber){
        userService.changePhoneNumber(phoneNumber,changePhoneNumber);
    }
}

