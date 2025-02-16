package factoryDesign;

import factoryDesign.phone.Android;
import factoryDesign.phone.OS;
import factoryDesign.phone.OperatingSystemFactory;
import factoryDesign.phone.Windows;

public class Factory {
    public static void main(String[] args) {
//        OS androidOS = new Android();
//        OS windowsOs = new Windows();
//
//        windowsOs.spec();
//        androidOS.spec();

        //create obj using factory
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS openOs = osf.getInstance("open");
        openOs.spec();
    }
}
