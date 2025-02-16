package factoryDesign.phone;

public class OperatingSystemFactory {
    public OS getInstance(String string){
        return switch (string) {
            case "open" -> new Android();
            case "closed" -> new Ios();
            default -> new Windows();
        };
    }
}
