package phone;

import java.util.ArrayList;

public class CallListController {
    private CallListService callListService;


    public CallListController(CallListService callListService) {
        this.callListService = callListService;
    }

    public CallList deleteCallList(String number) {
        return null;
    }

    public ArrayList<Call> showCallList() {
        return callListService.callList();

    }
    public Call sendCall(String number){
        return null;
    }



}
