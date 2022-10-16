package campus.assignmnet5.practice02;

import java.util.Objects;

public class SmartPhone extends MobileElectronic {
    protected int numOfCameras;
    protected int numOfSensors;

    public SmartPhone() {
    }

    public SmartPhone(int numOfCameras, int numOfSensors) {
        this.numOfCameras = numOfCameras;
        this.numOfSensors = numOfSensors;
    }

    public SmartPhone(CommunicationMethod communicationMethod, String weight, int numOfCameras, int numOfSensors) {
        super(communicationMethod, weight);
        this.numOfCameras = numOfCameras;
        this.numOfSensors = numOfSensors;
    }

    public int getNumOfCameras() {
        return numOfCameras;
    }

    public void setNumOfCameras(int numOfCameras) {
        this.numOfCameras = numOfCameras;
    }

    public int getNumOfSensors() {
        return numOfSensors;
    }

    public void setNumOfSensors(int numOfSensors) {
        this.numOfSensors = numOfSensors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhone that = (SmartPhone) o;
        return numOfCameras == that.numOfCameras && numOfSensors == that.numOfSensors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numOfCameras, numOfSensors);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "numOfCameras=" + numOfCameras +
                ", numOfSensors=" + numOfSensors +
                ", communicationMethod=" + communicationMethod +
                ", weight='" + weight + '\'' +
                '}';
    }
}
