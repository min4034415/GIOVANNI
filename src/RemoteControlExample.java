public class RemoteControlExample {
    public static void main(String[] args) {
        Television television = new Television();
        television.turnOn();
        Audio audio = new Audio();
        audio.turnOn();
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();

        rc = new Audio();
        rc.turnOn();
    }
    
}
