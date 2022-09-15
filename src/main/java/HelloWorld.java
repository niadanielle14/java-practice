import java.util.Arrays;
import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        System.out.print("Hello ");
//        System.out.print("World");
//        System.out.println("Nia Watson");
//        System.out.print("Nia ");
//        System.out.print("Watson");

//        int myFavoriteNumber = 32;
//        System.out.println(myFavoriteNumber);
//
//        String myString = "This is my string";
//        System.out.println(myString);
//
//        double myNumber = 3.4E38;
//        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//       TODO Time Converter
//        You need a program to convert days to seconds.
//        The given code takes the amount of days as input.
//        Complete the code to convert it to seconds and output the result.

        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();

        // 1. figure out how many seconds are in a days - 86400
        // 2. multiply the number of seconds in a day by the # of days
        int result = days * 86400;

        // 3. sout the result
        System.out.println(result);

//        TODO CONDITIONALS

    }
}

