package campus.assignmnet5.practice02;

import java.util.Date;
import java.util.Objects;

public class NoneMobileElectronic extends Electronic{
    protected String address;

    public NoneMobileElectronic() {
    }

    public NoneMobileElectronic(String address) {
        this.address = address;
    }

    public NoneMobileElectronic(String modelName, Date dateOfMade, Company companyName, AuthMethod[] authMethod, String address) {
        super(modelName, companyName, dateOfMade,authMethod);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoneMobileElectronic that = (NoneMobileElectronic) o;
        return address.equals(that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

    @Override
    public String toString() {
        return "NoneMobileElectronic{" +
                "address='" + address + '\'' +
                '}';
    }
}
