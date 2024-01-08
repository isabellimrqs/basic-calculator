import java.util.Locale;
import java.util.Scanner;

public class calculadoraApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double num1;
        Double num2;
        String operator;
        boolean continue;

        do{
        System.out.println("Type the first number: ");
        num1 = scanner.nextDouble();

        System.out.println("Type the operator(+,_,/,*): ");
        operator = scanner.next();

        System.out.println("Type the second number: ");
        num2 = scanner.nextDouble();

        System.out.println("Result: " + calculating(num1, num2, operator));
            
        continue = newOperation();
        }while(continue);
    }
    
    public static boolean newOperation(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to continue with a new operation? (Y/N): ");
        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }
    public static Double calculating(Double num1,Double num2, String operator){
        Double result = 0.0;

        switch (operator){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default: System.out.println("Please enter a valid operator...");

        }
        return result;
        }
    
}