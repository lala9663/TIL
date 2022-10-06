package campus.assignmnet5.practice01;

import java.util.Objects;

public class Electronic {
    int productNo=0;
    String modelName = "";
    String companyName = "";
    String datOfMade = "";
    String authMethod = "";     // 인증방법( 지문인증, 패턴인증, 핀 인증, 얼굴인증)-> Enum형으로 정의
                                // 하나의 전자 기기에는 다수의 인증 방법이 있을 수 도 있음


    public Electronic(int productNo, String modelName, String companyName, String datOfMade, String authMethod) {
        this.productNo = productNo;
        this.modelName = modelName;
        this.companyName = companyName;
        this.datOfMade = datOfMade;
        this.authMethod = authMethod;
    }

    public int getProductNo() {
        return productNo;
    }

    public void setProductNo(int productNo) {
        this.productNo = productNo;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDatOfMade() {
        return datOfMade;
    }

    public void setDatOfMade(String datOfMade) {
        this.datOfMade = datOfMade;
    }

    public String getAuthMethod() {
        return authMethod;
    }

    public void setAuthMethod(String authMethod) {
        this.authMethod = authMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Electronic that = (Electronic) o;
        return productNo == that.productNo && Objects.equals(modelName, that.modelName) && Objects.equals(companyName, that.companyName) && Objects.equals(datOfMade, that.datOfMade) && Objects.equals(authMethod, that.authMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productNo, modelName, companyName, datOfMade, authMethod);
    }

    @Override
    public String toString() {
        return "Electronic{" +
                "productNo=" + productNo +
                ", modelName='" + modelName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", datOfMade='" + datOfMade + '\'' +
                ", authMethod='" + authMethod + '\'' +
                '}';
    }
}
