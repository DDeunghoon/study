package phone;

public class PhoneView {
    private PhoneController phoneController;

    public PhoneView(PhoneController phoneController){
        this.phoneController = phoneController;
    }

    public void phoneView(){
        System.out.println("1.전화하기 ");
    }

}
