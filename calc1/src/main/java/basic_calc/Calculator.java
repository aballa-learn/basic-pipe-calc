package basic_calc;

/**
 * Hello world!
 *
 */
public class Calculator {
    public int evaluate(String expression) {
        int sum = 0;
        for (String summand : expression.split("\\+"))
            sum += Integer.valueOf(summand);
            return sum;
        //tes
    } 
}
