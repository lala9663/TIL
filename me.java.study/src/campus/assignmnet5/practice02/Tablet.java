package campus.assignmnet5.practice02;

import java.util.Objects;

public class Tablet {
   private String hasPencil="";

    public Tablet(String hasPencil) {
        this.hasPencil = hasPencil;
    }

    public String getHasPencil() {
        return hasPencil;
    }

    public void setHasPencil(String hasPencil) {
        this.hasPencil = hasPencil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tablet tablet = (Tablet) o;
        return Objects.equals(hasPencil, tablet.hasPencil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasPencil);
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "hasPencil='" + hasPencil + '\'' +
                '}';
    }
}
