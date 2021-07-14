package phone;

import java.util.ArrayList;

public class PhonController {

    public void functionExecute() {
        boolean example = true;
        int functionChoice = ScannerUtil.intScan();
        Call call = new Call();
        ArrayList<Contact> contacts = new ArrayList<>();
        ContactList contactList = new ContactList(contacts);
        CallService callService = new CallService(call, contactList);
        CallController callController = new CallController(callService);

        while (example) {
            System.out.println("1. 전화하기 ");

            switch (functionChoice) {
                case 1:
                    callController.startCall();
            }
        }

    }
}
