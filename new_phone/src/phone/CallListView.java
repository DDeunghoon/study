package phone;

import java.util.ArrayList;

public class CallListView {
    private CallListController callListController;

    public CallListView(CallListController callListController) {
        this.callListController = callListController;
    }

    public void showCallList() {
        ArrayList<Call> calls = callListController.showCallList();
        for (int i = 0; i < calls.size(); i++) {
            Call call = calls.get(i);
            System.out.println("통화 상대 : " + call.getNumber());
            System.out.println("통화시작시간 : " + call.getCallStartTime());
            System.out.println("통화 종료 시간 : " + call.getCallEndTime());
        }
    }

    public void deleteCallList() {
        System.out.println("통화 기록삭제");
        System.out.println("삭제할 번호를 입력하세요 ");
        String number = ScannerUtil.stringScan();
        callListController.deleteCallList(number);
        System.out.println("삭제 완료!");
    }

    public void callFromCallList(){
        System.out.println("통화목록에서 전화할 번호를 입력하세요");
        String numnber = ScannerUtil.stringScan();

    }

    public void showCallListFunction() {
        boolean running = true;
        while (running) {
            System.out.println("1.통화목록 2.통화목록 삭제 3.통화목록 종료");
            int choice = ScannerUtil.intScan();
            if (choice == 1) {
                showCallList();
                break;
            }
            if (choice == 2) {
                deleteCallList();
                break;
            }
            if (choice == 3) {
                running = false;
                break;
            }
        }
    }
}
