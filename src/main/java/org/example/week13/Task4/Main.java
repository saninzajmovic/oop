package org.example.week13.Task4;

public class Main {
    public static void main(String[] args) {
        OldDevice oldDevice = new OldDeviceImpl();
        NewDevice adapter = new DeviceAdapter(oldDevice);
        NewDevice newDevice = new NewDeviceImpl();

        newDevice.operateNewFunction();
        adapter.operateNewFunction();
    }
}
