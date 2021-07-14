package phone;

public class CallController {
    private CallService callService;

    public CallController(CallService callService) {
        this.callService = callService;
    }

    public Call startCall(String number) {
        return callService.sendCall(number);
    }

    public void endCall(Call call) {
        callService.endCall(call);
    }

}
