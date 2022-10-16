package campus.assignmnet5.practice02;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Electronic {
    public enum Company {
        SAMSUNG, LG, APPLE;
    }
    public enum AuthMethod{
        HAND, PATTERN, PIN, FACE;
    }

    public String productNo;
    public String modelName;
    public Company companyName;
    public Date dateOfMade;
    public AuthMethod[] authMethod;
    private static int count =0;

    public Electronic() {
        generateKey();
    }

    public Electronic(String modelName, Company companyName, Date dateOfMade, AuthMethod[] authMethod) {
        this.modelName = modelName;
        this.companyName = companyName;
        this.dateOfMade = dateOfMade;
        this.authMethod = authMethod;
        generateKey();
    }

    private void generateKey(){
        count++;    // 0<=  <10000
        productNo = String.format("%05d", count);   // 0<   <=10000
    }

    public String getProductNo() {
        return productNo;
    }

    private void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Company getCompanyName() {
        return companyName;
    }

    public void setCompanyName(Company companyName) {
        this.companyName = companyName;
    }

    public Date getDateOfMade() {
        return dateOfMade;
    }

    public void setDateOfMade(Date dateOfMade) {
        this.dateOfMade = dateOfMade;
    }

    public AuthMethod[] getAuthMethod() {
        return authMethod;
    }

    public void setAuthMethod(AuthMethod[] authMethod) {
        this.authMethod = authMethod;
    }

    @Override
    public String toString() {
        return "Electronic{" +
                "productNo='" + productNo + '\'' +
                ", modelName='" + modelName + '\'' +
                ", companyName=" + companyName +
                ", dateOfMade=" + dateOfMade +
                ", authMethod=" + Arrays.toString(authMethod) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Electronic that = (Electronic) o;
        return productNo.equals(that.productNo) && modelName.equals(that.modelName) && companyName == that.companyName && dateOfMade.equals(that.dateOfMade) && Arrays.equals(authMethod, that.authMethod);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(productNo, modelName, companyName, dateOfMade);
        result = 31 * result + Arrays.hashCode(authMethod);
        return result;
    }
}
