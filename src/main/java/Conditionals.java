import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;


public class Conditionals {
    public static void main(String[] args) {
////        System.out.println("If Else Statements");
//////        TODO
//////          You have $12,000 to buy a car.
//////          You're given a program which takes the price of car as an input.
//////          Task
//////          Output "yes" if the price is lower than or equal to 12,000.
//////           Sample Input
//////           11000
//////          Sample Output
//////          yes
////        Scanner scanner = new Scanner(System.in);
////        int price = scanner.nextInt();
////        //complete the code
////
////        if (price <= 12000) {
////            System.out.println("yes");
////        } else {
////            System.out.println("no");
////        }
////        System.out.println("Nested IF Else");
////
////        Todo
//////          The sales manager decided to give a gift card to the customers whose purchases total more than 15000. On top of this, the customers whose total purchase is above 30000 will receive a second gift card.
//////          You are given a program, which takes the purchase amount as input, and print "Gift card" if it is above 15000.
//////          Task
//////          Complete the code to print "Gift card" again if the purchase is above 30000.
////        Scanner read = new Scanner(System.in);
////        int purchases = read.nextInt();
////
////        if (purchases > 15000) {
////            System.out.println("Gift card");
////            //complete the code
////        }
////        if (purchases > 30000) {
////            System.out.println("Gift card");
////        }
////
////        System.out.println("Else if Statments ");
////        int age = 25;
////        if(age <= 0) {
////            System.out.println("Error");
////        } else if(age <= 16) {
////            System.out.println("Too Young");
////        } else if(age < 100) {
////            System.out.println("Welcome!");
////        } else {
////            System.out.println("Really?");
////        }
//
//
////        System.out.println("Switch Statements");
////        int day = 3;
////        switch(day) {
////            case 1:
////                System.out.println("Monday");
////                break;
////            case 2:
////                System.out.println("Tuesday");
////                break;
////            case 3:
////                System.out.println("Wednesday");
////                break;
//        }
//      TODO Your robot can recognize your emotions marked with number that represents each of them:
//          1 - You are happy!
//          2 - You are sad!
//          3 - You are angry!
//          4 - You are surprised!
//          Write a program that takes the emotion number as input and outputs the corresponding message in given format.
//          If the input is an emotion that the program doesn’t know, it should output: "Unknown emotion.".

//        Scanner scanner = new Scanner(System.in);
//        int emotion = scanner.nextInt();
//        switch(emotion){
//            case 1:
//                System.out.println("You are happy");
////                break;
//            case 2:
//                System.out.println("You are sad");
////                break;
//            case 3:
//                System.out.println("You are angry");
//                break;
//            case 4:
//                System.out.println("You are surprised");
//                break;
//                default:
//                System.out.println("Unknown emotion");
//                break;
//        }

        System.out.println("Switch Expression");
        int emotion = 2;
        String emotionLess = switch (emotion) {
            case 1, 2, 3, 4 -> "You are feeling emotions";
            case 5, 6, 7 -> "You are not";
            default -> "What is an emption?";
        };
        System.out.println(emotionLess);
    }

}
