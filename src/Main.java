import signiture.CalculationFunction;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {


        CalculationFunction addFunction = (num1, num2)->{ return num1 + num2;};
        CalculationFunction subtractFunction = (num1, num2)->{ return num1 - num2;};
        CalculationFunction devideFunction = (num1, num2)->{ return num1 / num2;};
        CalculationFunction multiplyFunction = (num1, num2)->{ return num1 * num2;};


    }
}
