package phone;

public class CallView {
    private CallController callController;

    public CallView() {
        this.callController = new CallController(new CallService());
    }

    public void callView() {
        System.out.println("전화할 번호를 입력하세여");
        String number = ScannerUtil.stringScan();
        Call call = callController.startCall(number);
        System.out.println("통화중");
        System.out.println("1.통화종료");
        int stopCallChoice = ScannerUtil.intScan();
        if (stopCallChoice == 1) {
            //통화중인걸 알려주는게 있어야 함 정보
            System.out.println("통화종료");
            callController.endCall(call);
        }
    }
}
