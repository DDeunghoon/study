package phone;

import java.util.ArrayList;

public class CallService {

    private CallList callList;



    public CallService() {
        //콜에 관련된것만 들고있고 단건객체는 필요할때 만드는것

        this.callList = new CallList(new ArrayList<>());

    }


    public Call sendCall(String number) {
        Call call = new Call(number);
        call.sendCall();
        callList.getCalls().add(call);
        if(number == "123"){
            System.out.println("dkssud");
        }
        throw new RuntimeException();
//        return call;
    }


    public void endCall(Call call) { //call을 매개변수로 받아야함 외부에서
        call.endCall();
    }



    //통화 목록에서 사용자를 선택후 전화하는 메소드
//    public void CallFromCallList(String userInformation) {
//        call.sendCall(userInformation);
//    }


}


