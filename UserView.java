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
        String duplicate = userController.removeDuplicates(removeText);
        System.out.println("3단계 마침표가 2번이상 중복되면 한개의 마침표로 치환합 :" + duplicate);
        String firstFullStop = userController.firstFullStop(duplicate);
        System.out.println("4단계 시작과 끝에있는 마침표 제거 :" + firstFullStop);
        String changeEmptySpace = userController.changeEmptySpace(firstFullStop);


    }

}
