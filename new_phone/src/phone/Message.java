package phone;

public class Message {
    private String number;
    private String content;
    private String messageTime;
    private String type;
    // 메세지의 타입을 보고 답장하기 활성화 아님 활성중지

    public Message(String number, String content, String type) {
        setNumber(number);
        setContent(content);
        setType(type);
        this.messageTime = PhoneTimeUtil.getCuurentTimeAsString();
//        this.messageTime = new Date();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void sendMessage(String number, String content) {

    }
}
