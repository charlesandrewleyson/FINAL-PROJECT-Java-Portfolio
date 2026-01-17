import java.util.ArrayList;
import java.util.List;

public class SmartHomeControlSystemm {
    public static void main(String[] args) {

        AirConditioner ac = new AirConditioner("Carrier", "Living Room");
        LampShade lamp1 = new LampShade("Panasonic,", "Living Room");
        LampShade lamp2 = new LampShade(lamp1);
        Television tv = new Television("Samsung QLED 55", "Living Room");
        Microwave microwave = new Microwave("American Home", "Kitchen");

        List<Device> devices = new ArrayList<>();
        devices.add(ac);
        devices.add(lamp1);
        devices.add(lamp2);
        devices.add(tv);
        devices.add(microwave);

        System.out.println("Powered On Count: " + Device.countPoweredOn(devices));

        Device.controlDevices(devices, true);  

        System.out.println("\nAfter Turning ON:");
        for (Device d : devices) d.status();

        System.out.println("Powered On Count: " + Device.countPoweredOn(devices));

        Device.controlDevices(devices, false); 

        System.out.println("\nAfter Turning OFF:");
        for (Device d : devices) d.status();

        System.out.println("Powered On Count: " + Device.countPoweredOn(devices));

    
        ac.setTemperature(22);
        lamp1.setBrightness(80);
        tv.setChannel(5);
        microwave.setTimer(5);
    }
}

abstract class Device {

    protected boolean isOn;
    protected String deviceType;
    protected String deviceName;
    protected String location;

    public Device(String deviceType, String deviceName, String location) {
        this.deviceType = deviceType;
        this.deviceName = deviceName;
        this.location = location;
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public boolean isPoweredOn() {
        return isOn;
    }

    public abstract void status();

    
    public static void controlDevices(List<Device> devices, boolean turnOn) {
        for (Device d : devices) {
            if (turnOn) d.turnOn();
            else d.turnOff();
        }
    }

    public static int countPoweredOn(List<Device> devices) {
        int count = 0;
        for (Device d : devices) {
            if (d.isPoweredOn()) count++;
        }
        return count;
    }
}


class AirConditioner extends Device {

    private int fanSpeed = 3;
    private int temperature = 24;

    public AirConditioner(String name, String location) {
        super("Air Conditioner", name, location);
    }

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
        if (isOn) status();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        if (isOn) status();
    }

    @Override
    public void status() {
        System.out.println("\n---------------------------------");
        System.out.println("Device: " + deviceType);
        System.out.println("Name: " + deviceName);
        System.out.println("Location: " + location);
        System.out.println("Status: " + (isOn ? "ON" : "OFF"));
        if (isOn) {
            System.out.println("Fan Speed: " + fanSpeed);
            System.out.println("Temperature: " + temperature + "°C");
        }
        System.out.println("---------------------------------");
    }
}



class LampShade extends Device {

    private int brightness;
    private String lightColor;

    public LampShade(String name, String location) {
        super("Lamp Shade", name, location);
    }

    public LampShade(LampShade other) {
        super("Lamp Shade", other.deviceName + " (Copy)", other.location);
        this.brightness = other.brightness;
        this.lightColor = other.lightColor;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        if (isOn) status();
    }

    public void setLightColor(String lightColor) {
        this.lightColor = lightColor;
        if (isOn) status();
    }

    @Override
    public void status() {
        System.out.println("\n---------------------------------");
        System.out.println("Device: " + deviceType);
        System.out.println("Name: " + deviceName);
        System.out.println("Location: " + location);
        System.out.println("Status: " + (isOn ? "ON" : "OFF"));
        if (isOn) {
            System.out.println("Brightness: " + brightness + "%");
            System.out.println("Light Color: " + lightColor);
        }
        System.out.println("---------------------------------");
    }
}



class Television extends Device {

    private int channel = 1;
    private int volume = 10;

    public Television(String name, String location) {
        super("Television", name, location);
    }

    public void setChannel(int channel) {
        this.channel = channel;
        if (isOn) status();
    }

    public void setVolume(int volume) {
        this.volume = volume;
        if (isOn) status();
    }

    @Override
    public void status() {
        System.out.println("\n---------------------------------");
        System.out.println("Device: " + deviceType);
        System.out.println("Name: " + deviceName);
        System.out.println("Location: " + location);
        System.out.println("Status: " + (isOn ? "ON" : "OFF"));
        if (isOn) {
            System.out.println("Channel: " + channel);
            System.out.println("Volume: " + volume + "%");
        }
        System.out.println("---------------------------------");
    }
}



class Microwave extends Device {

    private int timer = 0;
    private int temperature = 100;

    public Microwave(String name, String location) {
        super("Microwave Oven", name, location);
    }

    public void setTimer(int timer) {
        this.timer = timer;
        if (isOn) status();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        if (isOn) status();
    }

    @Override
    public void status() {
        System.out.println("\n---------------------------------");
        System.out.println("Device: " + deviceType);
        System.out.println("Name: " + deviceName);
        System.out.println("Location: " + location);
        System.out.println("Status: " + (isOn ? "ON" : "OFF"));
        if (isOn) {
            System.out.println("Timer: " + timer + " minutes");
            System.out.println("Temperature: " + temperature + "°C");
        }
        System.out.println("---------------------------------");
    }
}