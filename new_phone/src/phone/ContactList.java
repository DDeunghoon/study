package phone;

import java.util.ArrayList;

public class ContactList {
    private ArrayList<Contact> contacts;

    public ContactList(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }


    public Contact searchContactByName(String name) throws NullPointerException {
        for (int i = 0; i < contacts.size(); i++) {
            if (name.equals(contacts.get(i).getName())) {
                return contacts.get(i);

            }
        }
        return null;
    }

    public Contact searchContactByNumber(String number) throws NullPointerException {
        for (int i = 0; i < contacts.size(); i++) {
            if (number.equals(contacts.get(i).getNumber())) {
                return contacts.get(i);

            }
        }
        return null;
    }

//	public void sendMessageFromContactList(ArrayList<Message> sentMessages,int choise, String content) {
//		for (int i = 0; i < contacts.size(); i++) {
//			if ((choise - 1) == i) {
//			sentMessages.add(new Message(contacts.get(i).getName(), content));
//
//
//			//전화번호부가 메세지의 월권이다
//			//메세지에서 전화번호부를 불러야한다
//			//여기있으면 안댄다
//			//초이스라는 변수명은 못알아보겠다
//			//밖에서받은건 밖에서 해결 안에서 하면 월권
//			//수정 초이스를 넘길거면 따로빼서 메소드를 새로생성
//			//이롷게 하면안댐
//			//컨택트리스트전체를 받은면 안댐 서비스를 이용해야햄
//			}
//		}
//
//	}


    public void contactDelete(int i) {
        contacts.remove(contacts.get(i));


    }

}
