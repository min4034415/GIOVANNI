package Apr21;
public class SmartTelevision implements RemoteControl, Searchable{
    public void turnOff() {
        System.out.println("Turining OFf");
    }
    public void setVolume(int volume) {
        System.out.println("Setting volume to: " + volume);
    }
    public void turnOn() {
        System.out.println("Turinigni on");
    }
    public void search(String url){
        System.out.println(url);
    }
    
}
