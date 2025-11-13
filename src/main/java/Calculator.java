import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.logging.Logger;

public class Calculator {
    public static void main(String[] args){
        Logger logger = Logger.getLogger(Calculator.class.getName());
        Scanner input = new Scanner(System.in, StandardCharsets.UTF_8);
        logger.info("Enter the first number:");
        double num1 = input.nextDouble();
        logger.info("Enter the second number: ");
        double num2 = input.nextDouble();
        if(true){
            String resultLabel = "The added result is: ";
            double addedResult = addValues(num1, num2);
            logger.info(()-> String.format(resultLabel, addedResult));

            double subtractedResult = subtractValue(num1, num2);
            logger.info(()-> String.format(resultLabel, subtractedResult));

            double multipliedResult = multiplyValues(num1, num2);
            logger.info(()-> String.format(resultLabel, multipliedResult));


            double dividedResult = divideValue(num1, num2);
            logger.info(()-> String.format(resultLabel, dividedResult));
        }

    }
    public static double addValues(double num1, double num2){
        return num1 + num2;
    }

    public static double subtractValue(double num1, double num2){
        return num1 - num2;
    }

    public static double divideValue(double num1, double num2){
        return num1 / num2;
    }

    public static double multiplyValues(double num1, double num2){
        return num1 * num2;
    }
}
