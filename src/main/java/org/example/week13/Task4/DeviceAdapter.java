package org.example.week13.Task4;

public class DeviceAdapter implements NewDevice {
    private OldDevice oldDevice;

    public DeviceAdapter(OldDevice oldDevice) {
        this.oldDevice = oldDevice;
    }

    @Override
    public void operateNewFunction() {
        this.oldDevice.operateOldFunction();
    }
}
