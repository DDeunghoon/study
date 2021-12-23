public class UserView {

    private UserController userController;

    public UserView(){
        userController = new UserController();
    }
    public void show(String newId){
        System.out.println("입력된 아이디:" + newId);
        String lowerChar = userController.changeToLowercase(newId);
        System.out.println("1단계 대문자를 소문자로 변경:" + lowerChar);
        String removeText = userController.removeText(lowerChar);
        System.out.println("2단계 '!','@','*' 문자제거 " +  removeText);
        String duplicate = "";
    }

}
