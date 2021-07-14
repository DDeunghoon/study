package phone;

import java.util.ArrayList;

public class CallListService {
    private CallList callList;
    private CallService callService;

    public CallListService(CallList callList, CallService callService) {
        this.callList = callList;
        this.callService = callService;
    }


    public ArrayList<Call> callList() {
        return callList.getCalls();
    }

    public void callListDelete(String number) {
        callList.deleteCallList(number);


    }

    //통화목록에서 전화할수있는 메소드
    //input : 사용자가 통화목록에서 전화했던 번호
    //output: 새로운 객체생성 및 통화
    public void sendCallFromCallList(String number) {
        callService.sendCall(number);
    }

}

