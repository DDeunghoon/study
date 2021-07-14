package phone;

import java.util.ArrayList;

public class ContactListService {
    private ContactList contactList;
    private CallService callService;

    public ContactListService(ContactList contactList, CallService callService) {
        this.contactList = contactList;
        this.callService = callService;
    }

    public ContactList getContactList() {
        return contactList;
    }

    public void setContactList(ContactList contactList) {
        this.contactList = contactList;
    }

    public void contactAddition(String name, String number) {
        ArrayList<Contact> contacts = contactList.getContacts();
        contacts.add(new Contact(name, number));
    }

    public void deleteContact(String number) throws NullPointerException {
        ArrayList<Contact> contacts = contactList.getContacts();
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (number.equals(contact.getNumber()) || number.equals(contact.getNumber())) {
                contactList.contactDelete(i);
            }
        }
    }

    public Contact contactSearch(String userInformation) throws NullPointerException {
        ArrayList<Contact> contacts = contactList.getContacts();
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if(userInformation.equals(contact.getName())||userInformation.equals(contact.getNumber())){
                return contacts.get(i);
            }
        }
        return null;
    }
    public void sendCallFromContactList(String number){
        callService.sendCall(number);
    }


}
