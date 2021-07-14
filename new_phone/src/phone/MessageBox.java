package phone;

import java.util.ArrayList;

public class MessageBox {
    private ArrayList<Message> messages;

    public MessageBox(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public Message sentMessageSeparation() {

        for (int i = 0; i < messages.size(); i++) {
            Message message = messages.get(i);
            if (message.getType().equals("보낸 메세지")) {
                return message;
            }
        }
        return null;
    }

    public Message receiveMessageSeparation() {
        for (int i = 0; i < messages.size(); i++) {
            Message message = messages.get(i);
            if (message.getType().equals("받은 메세지")) {
                return message;

            }
        }
        return null;
    }



    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
}
