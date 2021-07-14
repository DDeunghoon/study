package phone;

public class CallService {
    private Call call;
    private ContactList contactList;
    //보통 서비스는 서비스를 생성한다고 했는데 전화번호부는 다른 클래스가 필요하지않은거 같다 그러면 전화번호부는 서비스를 가지고 있어야하나??

    public CallService(Call call, ContactList contactList) {
        this.call = call;
        this.contactList = contactList;
    }

    ;

    public CallService(Call call) {
        this.call = call;
    }

    public void sendCall(String number) {
        try {
            String contact = contactList.searchContactByNumber(number).getName();
            call.sendCall(contact);
        } catch (NullPointerException e) {
            call.sendCall(number);
        }

    }

    public void endCall() {
        call.endCall();
    }

    public String startCallTime() {
       return call.startTime();

    }

    public String endCallTime() {
       return call.endTime();
    }

}
