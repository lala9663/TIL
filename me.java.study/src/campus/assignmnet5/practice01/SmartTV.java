package campus.assignmnet5.practice01;

import java.util.Objects;

public class SmartTV {
    int inch = 0;

    public SmartTV(int inch) {
        this.inch = inch;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartTV smartTV = (SmartTV) o;
        return inch == smartTV.inch;
    }

    @Override
    public int hashCode() {
        return Objects.hash(inch);
    }

    @Override
    public String toString() {
        return "SmartTV{" +
                "inch=" + inch +
                '}';
    }
}
