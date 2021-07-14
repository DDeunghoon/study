package phone;

public class CallController {
    private CallService callService;

    public CallController(CallService callService){
        this.callService = callService;
    }

    public void startCall(){
        System.out.println("전화할 번호를 입력하세요 ");
        String number = ScannerUtil.stringScan();
        System.out.println("1.전화하기 2. 전화하기 종료");
        int Choice = ScannerUtil.intScan();
        if(Choice == 1){
            callService.sendCall(number);
            System.out.println("통화중");
            System.out.println("1.통화종료");
            int endChoice = ScannerUtil.intScan();
            if(endChoice == 1){
                String startTime = callService.startCallTime();
                String endTime = callService.endCallTime();
                System.out.println("통화시작시간 : " + startTime);
                System.out.println("통화종료시간 : " + endTime);
            }
        }
        if (Choice == 2){
            System.out.println("전화하기 종료");
        }
    }


}
