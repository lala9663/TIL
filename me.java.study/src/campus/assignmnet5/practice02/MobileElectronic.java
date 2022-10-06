package campus.assignmnet5.practice02;

import java.util.Objects;

public class MobileElectronic {
    private String communicationMethod="";
    private int weight = 0;

    public MobileElectronic(String communicationMethod, int weight) {
        this.communicationMethod = communicationMethod;
        this.weight = weight;
    }

    public String getCommunicationMethod() {
        return communicationMethod;
    }

    public void setCommunicationMethod(String communicationMethod) {
        this.communicationMethod = communicationMethod;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobileElectronic that = (MobileElectronic) o;
        return weight == that.weight && Objects.equals(communicationMethod, that.communicationMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(communicationMethod, weight);
    }

    @Override
    public String toString() {
        return "MobileElectronic{" +
                "communicationMethod='" + communicationMethod + '\'' +
                ", weight=" + weight +
                '}';
    }
}
