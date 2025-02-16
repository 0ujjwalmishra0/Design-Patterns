package buiderDesign;

public class Shop {
    public static void main(String[] args) {
//        Phone phone = new Phone("Android 11",5,"qualcomm",6.5,5000);

        PhoneBuilder phone = new PhoneBuilder().setOS("Android").setRam(2).setBattery(3000);
        System.out.println(phone);
    }
}
