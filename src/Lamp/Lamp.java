package Lamp;
public class Lamp {
    boolean isOn;
    void turnOn(){
        isOn=true;
        System.out.println("Lights on? " + isOn);    
    }
    void turnOff(){
        isOn=false;
        System.out.println("Lights off? " + isOn);
    }
    class Main {
        public static void main (String[] args){
            Lamp led = new Lamp();
            Lamp halogen = new Lamp();
        led.turnOn();
        halogen.turnOff();
        }
    }
}