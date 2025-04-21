public class Television implements RemoteControl {


    private int volume;

    public void turnOn() {
        System.out.println("HIYA");
    }
    public void turnOff() {
        System.out.println("Turn OFF");
    }
    public void setVolume(int volume){
        if(volume>RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }   
        System.out.println("Now volume" + this.volume);
     }
}

