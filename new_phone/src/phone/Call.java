package phone;

public class Call {

    private String number;
    private String callStartTime;
    private String callEndTime;
    private String state;

    //서비스, 도메인, 실행클래스 비슷한 메소드들이 많은데 변수명은 어떤식으로 하는게 더 좋을지 모르겠슴


    public Call(String number) {
        setNumber(number);
    }

    public String getCallEndTime() {
        return callEndTime;
    }

    public void setCallEndTime(String callEndTime) {
        this.callEndTime = PhoneTimeUtil.getCuurentTimeAsString();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public String getCallStartTime() {
        return callStartTime;
    }

    public void setCallStartTime(String callStartTime) {
        this.callStartTime = PhoneTimeUtil.getCuurentTimeAsString();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    //전화를 거는 메소드
//input : 사용자가 입력해주는 번호
//output : call클래스 안에 있는 번호 초기화 및 시간생성 상태를 통화중으로 변경

    public void sendCall() {
        setNumber(this.number);
        getCallStartTime();
        setState("통화중");
    }


    //전화를 종료하는 메소드
//input: 없음
//output: 통화종료시간을 새로 초기화
    public void endCall() {
        getCallEndTime();
        setState("통화종료");
    }


}
