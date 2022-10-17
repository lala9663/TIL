package campus.assignmnet5.practice02;


import java.util.Arrays;

public class Electronics {

    protected Electronic[] electronics;
    private static final int DEFAULT_SIZE = 10;
    private static int count = 0;

    public Electronics() {
        electronics = new Electronic[DEFAULT_SIZE];
    }

    public Electronics(int size) {
        electronics = new Electronic[size];
    }

    public Electronics(Electronic[] electronics) {
        this.electronics = electronics;
    }

    public Electronic get(int i) {
        return electronics[i];
    }

    public Electronic find(String key) {
        for (int i = 0; i < electronics.length; i++) {
            if (electronics[i] != null) {
                if (electronics[i].getProductNo() != null) {
                    if (electronics[i].getProductNo().equals(key)) {
                        return electronics[i];
                    }
                }
            }
        }
        return null;
    }

    public void add(Electronic electronic) {
        electronics[count] = electronic;
        count++;
    }

    public Electronics[] groupByCompanyName() {
        Electronics[] groups = {new Electronics(), new Electronics(), new Electronics()};

        for (int i = 0; i < Electronic.Company.values().length; i++) {       // values 가 enum 타입의 배열로 반환
            for (int j = 0; j < electronics.length; j++)
                if (electronics[j] != null) {
                    if (electronics[j].getCompanyName() != null)
                        if (electronics[j].getCompanyName().equals(Electronic.Company.values()[i])) {
                            groups[i].add(electronics[j]);
                        }
                }
        }
    return groups;
}
    // { SAMSUNG, LG, APPLE}

    public Electronic[] getElectronics() {
        return electronics;
    }

    public void setElectronics(Electronic[] electronics) {
        this.electronics = electronics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Electronics that = (Electronics) o;
        return Arrays.equals(electronics, that.electronics);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(electronics);
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "electronics=" + Arrays.toString(electronics) +
                '}';
    }
}
