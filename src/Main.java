import java.util.Scanner;
public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        solvePerimeterRectangle();
        solveArea();
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


}