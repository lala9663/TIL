package campus.assignmnet5.practice02;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class SmartTV extends NoneMobileElectronic {
    protected int inch;

    public SmartTV() {
    }

    public SmartTV(int inch) {
        this.inch = inch;
    }

    public SmartTV(String address, int inch) {
        super(address);
        this.inch = inch;
    }

    public SmartTV(String modelName, Company companyName, Date dateOfMade, AuthMethod[] authMethod, String address, int inch) {
        super(modelName, dateOfMade, companyName, authMethod, address);
        this.inch = inch;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    @Override
    public String toString() {
        return "SmartTV{" +
                "inch=" + inch +
                ", address='" + address + '\'' +
                ", productNo='" + productNo + '\'' +
                ", modelName='" + modelName + '\'' +
                ", dateOfMade=" + dateOfMade +
                ", companyName=" + companyName +
                ", authMethod=" + Arrays.toString(authMethod) +
                '}';
    }
}
