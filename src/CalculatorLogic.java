
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PhongFPT
 */
public class CalculatorLogic {

    private BigDecimal num1, num2, result;
    private BigDecimal memory = new BigDecimal("0");
    private String operator;
    private boolean firstCalculate = true;
    void getData(String  screenString) {      
        if (firstCalculate) {
            num1 = new BigDecimal(screenString);
            firstCalculate = false;
        } else {
            num2 = new BigDecimal(screenString);
        }
    }

    void calculate() {
        switch (operator) {
            case "+":
                result = num1.add(num2);
                break;
            case "-":
                result = num1.subtract(num2);
                break;
            case "*":
                result = num1.multiply(num2);
                break;
            case "/":
                if(num2==new BigDecimal("0")){
                    throw new ArithmeticException();
                }
                result = num1.divide(num2, 4, RoundingMode.CEILING);
                break;

        }
    }
    public BigDecimal getNum1() {
        return num1;
    }

    public void setNum1(BigDecimal num1) {
        this.num1 = num1;
    }

    public BigDecimal getNum2() {
        return num2;
    }

    public void setNum2(BigDecimal num2) {
        this.num2 = num2;
    }

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public boolean isFirstCalculate() {
        return firstCalculate;
    }

    public void setFirstCalculate(boolean firstCalculate) {
        this.firstCalculate = firstCalculate;
    }

    public BigDecimal getMemory() {
        return memory;
    }

    public void setMemory(BigDecimal memory) {
        this.memory = memory;
    }
    
}
