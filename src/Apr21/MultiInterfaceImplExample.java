package Apr21;
public class MultiInterfaceImplExample {
  public static void main(String[] args) {
    RemoteControl rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();
  Searchable sc = new SmartTelevision();
    sc.search("HIHIH");
  };
}
