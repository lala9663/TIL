package campus.assignmnet5.practice02;

import java.util.Date;
import java.util.Objects;

public class Tablet extends Electronic {
    protected boolean hasPencil;

    public Tablet() {
    }

    public Tablet(boolean hasPencil) {
        this.hasPencil = hasPencil;
    }

    public boolean isHasPencil() {
        return hasPencil;
    }

    public void setHasPencil(boolean hasPencil) {
        this.hasPencil = hasPencil;
    }

    public Tablet(String modelName, Date dateOfMade, Company companyName, AuthMethod[] authMethod, boolean hasPencil) {
        super(modelName,  companyName,dateOfMade, authMethod);
        this.hasPencil = hasPencil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tablet tablet = (Tablet) o;
        return hasPencil == tablet.hasPencil;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasPencil);
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "hasPencil=" + hasPencil +
                '}';
    }
}
