package phone;

public class MessageService {
    private ContactList contactList;
    private MessageBox messageBox;

    public MessageService(ContactList contactList, MessageBox messageBox) {
        this.contactList = contactList;
        this.messageBox = messageBox;

    }// 서비스는 컨트롤러는 호출하면 안댐
    // 서비스는 메시지를 직접 불러야함
    // 관계역전임
    // message.send 여야함
    // message 를 변화시켜야하는데 지금은 커트롤러만 건들이고 있음
    // 서로가 연관되지 않게 돌아가야함

    //서비스는 서비스를 호출함 정석으로는
    //서비스는  생성자에 남의 객체를넣눈 경우는 흔치않다
    //정석적으로는
    public void sendMessageFromContactList(String number, String content) {
        Contact contact = contactList.searchContactByName(number);
        Message message = new Message(contact.getName(), content, "보낸 메시지");
        messageBox.getMessages().add(message);

    }

    public void sendMessage(String number, String content) {
        Message message = new Message(number, content, "보낸 메시지");
        message.sendMessage(number, content);

    }
}
