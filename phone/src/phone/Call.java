package phone;

public class Call {

    private String number;
    private String startCalltime;
    private String endCalltime;
    private String state;


    public String getEndCalltime() {
        return endCalltime;
    }

    public void setEndCalltime(String endCalltime) {
        this.endCalltime = endCalltime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public String getStartCalltime() {
        return startCalltime;
    }

    public void setStartCalltime(String startCalltime) {
        this.startCalltime = startCalltime;
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

    public void sendCall(String number) {
        setNumber(number);
        setStartCalltime(startTime());
        setState("통화중");
    }


    //전화를 종료하는 메소드
    //input: 없음
    //output: 통화종료시간을 새로 초기화
    public void endCall() {
        setEndCalltime(endTime());
        setState("통화종료");
    }


    public String startTime() {
        String startTime = PhoneTimeUtil.getCuurentTimeAsString();
        return startTime;
    }

    public String endTime() {
        String endTime = PhoneTimeUtil.getCuurentTimeAsString();
        return endTime;
    }


}
