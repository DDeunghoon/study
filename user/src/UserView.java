import java.util.ArrayList;

public class UserView {

    private UserController userController;

    public UserView() {
        this.userController = new UserController();
    }

    public void show() {
        boolean running = true;
        while (running) {
            System.out.println("1. 회원각입 2.유저 정보보기 3.삭제하기 4.핸드폰 번호 변경하기  7.종료 ");
            int choice = ScannerUtil.intScan();
            switch (choice) {
                case 1:
                    createView();
                    break;
                case 2:
                    showUser();
                    break;
                case 3:
                    deleteUser();
                    break;
                case 4:
                    changePhoneNumber();
                    break;
                case 7:
                    running = false;
                    break;
            }
        }
    }


    public void createView() {
        System.out.println("회원가입 선택!!");
        System.out.println("이메일을 입력하세요 ");
        String userEmail = ScannerUtil.stringScan();
        System.out.println("비밀번호를 입력하세요");
        String password = ScannerUtil.stringScan();
        System.out.println("닉네임을 입력하세요~");
        String nickName = ScannerUtil.stringScan();
        System.out.println("핸드폰 번호를 입력하세요 ");
        String phoneNumber = ScannerUtil.stringScan();
        try {
            userController.create(userEmail, password, nickName, phoneNumber);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public void showUser() {
        ArrayList<User> users = userController.getUsers();
        if (users.isEmpty()) {
            System.out.println("유저가 존재하지 않습니다 ");
            return;
        }
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            System.out.println(user);
        }
    }

    public void deleteUser() {
        System.out.println("삭제할 유저의 전화번호를 입력하세요 ");
        String phoneNumber = ScannerUtil.stringScan();
        System.out.println("삭제할 유저의 번호가 " + phoneNumber + " 맞습니까??");
        System.out.println("1.삭제하기 2.종료하기");
        int choice = ScannerUtil.intScan();
        if (choice == 1) {
            try {
                userController.deleteUser(phoneNumber);
                System.out.println("삭제완료");

            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }

        if (choice == 2) {
            System.out.println("유저 정보 삭제하기 종료!");
        }

    }
    public void changePhoneNumber(){
        System.out.println("변경할 핸드폰 전화번호를 입력하세요 ");
        String phoneNumber = ScannerUtil.stringScan();
        System.out.println("변경할 번호를 입력하세여 ");
        String changePhoneNumber = ScannerUtil.stringScan();
        try {
            userController.changePhoneNumber(phoneNumber, changePhoneNumber);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        System.out.println("변경완료! ");

    }
}
