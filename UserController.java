public class UserController {

    private UserService userService;

    public UserController(){
        this.userService = new UserService();
    }

    public String changeToLowercase(String userId) {
    return userService.changeToLowerCase(userId);
    }
    public String removeText(String userId){
        return userService.removeText(userId);
    }
    public String removeDuplicates(String userId){
        return userService.removeDuplicates(userId);
    }
    public String firstFullStop(String userId){
        return userService.firstFullStop(userId);
    }
    public String changeEmptySpace(String userId){
        return userService.changeEmptySpace(userId);
    }
}
