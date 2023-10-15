import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        DrawGame();
    }
    //Create a program that asks the user for a password.
    // If the password is right, a secret message is shown to the user.
    public static void Password() {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter password");
            String name = in.nextLine();
            if (name.equals("dario")) {
                System.out.println("You got it!");
                break;
            } else {
                System.out.println("Try again");
            }
        }
    }
    //Create a program that asks the user for three numbers and then prints their sum.
    // Use the following structure in your program:
    public static void sumOfThree(){
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.println("Please Enter the First number!");
        int readd = Integer.parseInt(input.nextLine());
        System.out.println("Number One is "+readd);
        sum+=readd;

        System.out.println("Please Enter the Second number!");
        readd = Integer.parseInt(input.nextLine());
        System.out.println("Number Second is "+readd);
        sum+=readd;

        System.out.println("Please Enter the Third number!");
        readd = Integer.parseInt(input.nextLine());
        System.out.println("Number Third is "+readd);
        sum+=readd;

        System.out.println("The sum is "+sum);
        }
    //Create a program that reads numbers from the user and prints their sum.
    // The program should stop asking for numbers when the user enters the number 0.
    // The program should be structured like this:
    public static void sumifzero() {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Enter number");
            int i = Integer.parseInt(in.nextLine());
            if (i == 0) {
                System.out.println("Thank you!");
                break;
            }
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
    //Create a program that asks the user for the first number and the
    // last number and then prints all numbers between those two. Use a while loop.
    public static void OnetoTwo(int a,int b){
        if (b<a){
            System.out.println("error");
        }
        for(int i = a;i<b+1;i++){
            System.out.println(i);
        }
    }
    //Create a program that calculates the sum of 20+21+22+...+2n, where n is a number entered by the user.
    public static void POW(int num, int tothepower) {
        int i = 1;
        int mulp = 1;
        while (i < tothepower + 1) {
            mulp *= num;
            i++;
        }
        System.out.println(mulp);
    }
    //Create a method printText that prints the following string of characters:
    // "In the beginning there were the swamp, the hoe and Java." and a line break.
    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
    //Create a method printStars that prints the given amount of stars and a line break.
    // Create the method in the following body:
    public static void printStar(int a){
        for (int i = 0;i<a;i++){
            System.out.print("*");
        }
    }
    //Create a method called drawStarsPiramid
    // that will accept the number of rows as a parameter and print a half
    // piramid shape where the number of rows will be dictated by the sent parameter.
    public static void drawStarPiramid(int a){
        for (int i = 0;i<a;i++){
            for (int j = 0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    // Create a method called drawStarsPiramid that will accept the number of rows as a parameter
    // and print a half piramid shape where the number of rows will be dictated by the sent parameter.
    public static void drawnumbersPiramid(int a){
        for (int i = 0;a>i;a--){
            for (int j = 0;j<a;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void drawStarPiramidNumbers(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    public static void drawStarPiramidNumbersStatic(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
    //STEP 1: The program that comes with the exercise contains a command called drawNumber.
    // It draws a number, which is in the range 0 to 100 (both 0 and 100 are possible). Create a program that draws a
    // number. Then the user has the chance to guess once, what the number is. The program should print "The number
    // is lesser", "The number is greater" or "Congratulations, your guess is correct!"
    // depending on the number the user typed
    public static void DrawGame(){
        Random rand= new Random();
        Scanner in= new Scanner(System.in);
        int upperbound=100;
        int randomint= rand.nextInt(upperbound);
        System.out.println(randomint);
        int guess=in.nextInt();
        if (randomint==guess){
            System.out.println("You got it corredt!");
        } else if (guess<randomint) {
            System.out.println("The number is higher then "+guess);
        } else if (guess>randomint) {
            System.out.println("The number is lower then "+guess);
        }
    }
    //STEP 2: Develop your program by adding the following functionality:
    // the guessing should be made repeatedly until the user types the right number.
    // Note that you need to draw the number by using the drawNumber command before the repetition.
    // Why? What happens if you draw the number inside the repetition?
    public static void DrawGameStep2(){
        Random rand= new Random();
        Scanner in= new Scanner(System.in);
        int upperbound=100;
        int randomint= rand.nextInt(upperbound);
        while (true) {
            System.out.println("Guess a number");
            System.out.println(randomint);
            int guess = in.nextInt();
            if (randomint == guess) {
                System.out.println("You got it corredt!");
                break;
            } else if (guess < randomint) {
                System.out.println("The number is higher then " + guess);
            } else if (guess > randomint) {
                System.out.println("The number is lower then " + guess);
            }
        }
    }
}
