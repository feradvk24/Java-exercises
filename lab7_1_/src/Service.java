import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Service {
    private List<Device> devices;
    private List<BrokenDevice> brokenDevices;

    public Service() {
        this.devices = new ArrayList<>();
        this.brokenDevices = new ArrayList<>();
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> l) {
        this.devices = l;
    }

    public List<BrokenDevice> getBrokenDevices() {
        return brokenDevices;
    }

    public void setBrokenDevices(List<BrokenDevice> l) {
        this.brokenDevices = l;
    }

    public void writeListToFile(String deviceFileName, String brokenDeviceFileName){
        try {
            ObjectOutputStream writeToFile = new ObjectOutputStream(new FileOutputStream(deviceFileName));
            for (Device a:
                    getDevices()) {
                writeToFile.writeObject(a);
            }
            writeToFile.close();
            writeToFile = new ObjectOutputStream(new FileOutputStream(brokenDeviceFileName));
            for (BrokenDevice a: getBrokenDevices()) {
                writeToFile.writeObject(a);
            }
            writeToFile.close();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }

    public void getDevicesFromFile(String deviceFileName) {
        List<Device> l = new ArrayList<>();
        try {
            ObjectInputStream readList = new ObjectInputStream(new FileInputStream(deviceFileName));
            while (true) {
                try {
                    l.add((Device)readList.readObject());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (EOFException e){
                    break;
                }

            }
            setDevices(l);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public void getBrokenDevicesFromFile(String brokenDeviceFileName) {
        List<BrokenDevice> l = new ArrayList<>();
        try {
            ObjectInputStream readList = new ObjectInputStream(new FileInputStream(brokenDeviceFileName));
            while (true) {
                try {
                    l.add((BrokenDevice) readList.readObject());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (EOFException e){
                    break;
                }

            }
            setBrokenDevices(l);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public void addDevice(Device dev, String fileName) {
        try{
        ObjectOutputStream add = new ObjectOutputStream(new FileOutputStream(fileName));
        add.writeObject(dev);
        getDevices().add(dev);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void addDevice(BrokenDevice dev, String fileName) {
        try{
            ObjectOutputStream add = new ObjectOutputStream(new FileOutputStream(fileName));
            add.writeObject(dev);
            getBrokenDevices().add(dev);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void moveToBrokenDevices(String modelName){
        Scanner sc = new Scanner(System.in);
        for (Device a:
             getDevices()) {
            if (a.getModel().equals(modelName)) {
                System.out.println("Found a match! Enter the device's symptoms and repair days:");
                BrokenDevice toBroken = new BrokenDevice(a.getBrand(), a.getModel(), a.getPrice(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
                getBrokenDevices().add(toBroken);
                getDevices().remove(a);
                break;
            }
        }


    }
}
