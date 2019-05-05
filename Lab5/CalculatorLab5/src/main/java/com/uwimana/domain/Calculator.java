package com.uwimana.domain;

import java.io.Serializable;

public class Calculator implements Serializable {

    private static final long serialVersionUID = 3678107792576131001L;

    private Integer num1;
    private Integer num2;
    private Integer num3;
    private Integer num4;
    private Integer sum;
    private Integer product;

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public Integer getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public Integer getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public Integer getSum() {
        return sum;
    }
    public void setSum(Integer sum) {
        this.sum = sum;
    }
    public Integer getProduct() {
        return product;
    }
    public void setProduct(Integer product) {
        this.product = product;
    }


    public void add(){
        sum = num1 + num2;
    }

    public void mult(){
        product = num3 * num4;
    }

}
