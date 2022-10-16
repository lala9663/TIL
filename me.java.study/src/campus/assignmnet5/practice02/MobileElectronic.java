package campus.assignmnet5.practice02;

import java.util.Objects;

public class MobileElectronic extends Electronic {
    enum CommunicationMethod{
        FIVE_G, FOUR_G, THREE_G
    }
    protected CommunicationMethod communicationMethod;
    protected String weight;

    public MobileElectronic() {
    }

    public MobileElectronic(CommunicationMethod communicationMethod, String weight) {
        this.communicationMethod = communicationMethod;
        this.weight = weight;
    }

    public CommunicationMethod getCommunicationMethod() {
        return communicationMethod;
    }

    public void setCommunicationMethod(CommunicationMethod communicationMethod) {
        this.communicationMethod = communicationMethod;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobileElectronic that = (MobileElectronic) o;
        return communicationMethod == that.communicationMethod && weight.equals(that.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(communicationMethod, weight);
    }

    @Override
    public String toString() {
        return "MobileElectronic{" +
                "communicationMethod=" + communicationMethod +
                ", weight='" + weight + '\'' +
                '}';
    }
}
