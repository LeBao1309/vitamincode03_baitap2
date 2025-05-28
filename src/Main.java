import java.util.Scanner;
public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static String continueMethod ="";
    public static void main(String[] args) {
        System.out.print("Choose method : ");
        int method = getInput();

        switch (method) {
            case 1:
                System.out.println("Exercise 1");
                solvePerimeterRectangle();
                solveArea();
                break;
            case 2:
                System.out.println("Exercise 2");
                calculateBasicOperations();
                break;

            case 3:
                System.out.println("Exercise 3");
                bankInterest();
                break;
            case 4:
                System.out.println("Exercise 4");
                checkEvenOrOdd();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    private static int getInput(){
        while(true){
            try {
                return sc.nextInt();
            } catch (Exception e){
                System.out.println("Invalid input");
                sc.nextLine();
            }
        }
    }
    private static void solvePerimeterRectangle(){
        System.out.print("Enter width: ");
        int width = getInput();
        System.out.print("Enter height: ");
        int height = getInput();

        System.out.println("Perimeter of rectangle:"+ ((width+height)*2));
    }

    private static void solveArea(){
        System.out.print("Enter width: ");
        int width = getInput();
        System.out.print("Enter height: ");
        int height = getInput();

        System.out.println("Area of rectangle:"+ (width*height));
    }

    private static void calculateBasicOperations() {
        System.out.print("Enter first number: ");
        int number1 = getInput();

        System.out.print("Enter second number: ");
        int number2 = getInput();

        System.out.println("Sum: " + (number1 + number2));
        System.out.println("Difference: " + (number1 - number2));
        System.out.println("Product: " + (number1 * number2));

        if (number2 != 0) {
            System.out.printf("Quotient: %.2f%n", ((double) number1 / number2));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }

    private static void bankInterest(){
        final double rate = 0.8;
        do {
            System.out.print("Enter the principal amount: ");
            double principal = sc.nextDouble();

            System.out.print("Enter the times : ");
            double times = sc.nextDouble();

            double interest = (principal * rate * times) / 100;

            System.out.printf("The interest after %.1f year(s) is: %.2f VND\n", times, interest);


            System.out.print("Do you want to continue? (y/n): ");
            sc.nextLine();
            continueMethod = sc.nextLine();

        } while (continueMethod.equalsIgnoreCase("y"));
             System.out.println("Program finished.");
    }

    private static void checkEvenOrOdd(){

        do{
            System.out.print("Enter number: ");
            int number = getInput();

            if(number % 2 == 0){
            System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
            System.out.print("Do you want to continue? (y/n): ");
            continueMethod = sc.nextLine();

        }while(continueMethod.equalsIgnoreCase("y"));
        System.out.println("Program finished.");
    }
}