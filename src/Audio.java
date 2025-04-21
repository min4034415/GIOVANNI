public class Audio implements RemoteControl {


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

     private int memoryVolume; 

     @Override
     public void setMute(boolean mute) {
        if(mute){
            this.memoryVolume = this.volume;
            System.out.println("Shutting volume");
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("UNMUTING");
            setVolume(this.memoryVolume);
        }
     }
}
