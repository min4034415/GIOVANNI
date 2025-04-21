public interface RemoteControl {
  int MAX_VOLUME = 10;
  int MIN_VOLUME = 10;
  void turnOn();
  void turnOff();
  void setVolume(int volume);

  default void setMute(boolean mute) {
    if (mute) {
      System.out.println("MUTE");
      setVolume(MIN_VOLUME);
    }
    else {
      System.out.println("UNMUTE");
    }
  }
}
