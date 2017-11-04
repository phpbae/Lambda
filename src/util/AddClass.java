package util;

/**
 * Created by Administrator on 2017-11-04.
 */
public class AddClass {

    private int num1=0;
    private int num2=0;

    public AddClass() {

    }

    public AddClass(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return num1 + num2;
    }

    public int add2(int num1, int num2) {
        return num1 + num2;
    }


}
