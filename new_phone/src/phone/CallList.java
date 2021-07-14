package phone;

import java.util.ArrayList;

public class CallList {
    ArrayList<Call> calls; // 어레이만 들고있는거 만들지말기 서비스안에서 로직으로

    public CallList(ArrayList<Call> calls) {
        setCalls(calls);
    }

    public ArrayList<Call> getCalls() { return calls; }

    public void setCalls(ArrayList<Call> calls) {
        this.calls = calls;
    }

    //input : 사용자가 선택한 유저 정보
    //output: 사용자가 선택한 정보를 제거
    public void deleteCallList(String userInformation) {
        for (int i = 0; i < calls.size(); i++) {
            String number = calls.get(i).getNumber();
            if (userInformation.equals(number)) {
                calls.remove(getCalls().get(i));
            }
        }
    }
}
