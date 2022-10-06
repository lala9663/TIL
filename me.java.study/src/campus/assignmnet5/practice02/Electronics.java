package campus.assignmnet5.practice02;

import java.util.ArrayList;
import java.util.Arrays;

public class Electronics {

    private Electronic[] electronics;

    public Electronics(Electronic[] electronics) {
        this.electronics = electronics;
    }

    public Electronic findByProductNo(String string){
        for (int i = 0; i <this.electronics.length ; i++) {
            if (electronics[i].getProductNo().equals(string)){
                return  electronics[i];
            }
        }
        return null;
    }


}
