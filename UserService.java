public class UserService {
    private User user;

    public UserService() {
        this.user = new User();
    }

    public String changeToLowerCase(String userId) {
        String result = userId.toLowerCase();
        user.setNewId(result);
        return result;
    }

    public String removeText(String userId) {
        String match = "[^0-9a-z_.-]";
        String result = userId.replaceAll(match,"");
        user.setNewId(result);
        return result;
    }

    public String removeDuplicates(String userId) {
    return null;
    }
}