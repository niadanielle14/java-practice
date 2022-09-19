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

//        System.out.println("Switch Expression");
//        int emotion = 2;
//        String emotionLess = switch (emotion) {
//            case 1, 2, 3, 4 -> "You are feeling emotions";
//            case 5, 6, 7 -> "You are not";
//            default -> "What is an emption?";
//        };
//        System.out.println(emotionLess);
//        System.out.println("Loops ");
//        System.out.println("While Loop");
//        int x = 3;
//        while(x > 0) {
//            System.out.println(x);
//            x--;
//        }
//        System.out.println("Factorial of a number");
////        Todo For your math class you need a program to calculate the factorial of a number.
////          You're given a program which takes a number as input.
////           Task
////              Complete the program to calculate the factorial of the given number and output it.
//
//        Scanner scanner = new Scanner(System.in);
//        int  number = scanner.nextInt();
//        int fact = 1;
//        //your code goes here
//
//        // fact = * number <=
//        while(number > 0) {
//            fact *= number --;
//        }
//        System.out.println(fact);

//        System.out.println("For Loops");
//        A for loop allows you to efficiently write a loop
//        that needs to execute a specific number of times.

//        for (initialization; condition; increment/decrement) {
//            statement(s);

//            Initialization: Expression executes only once during the beginning of loop
//            Condition: Is evaluated each time the loop iterates. The loop executes the statement repeatedly, until this condition returns false.
//            Increment/Decrement: Executes after each iteration of the loop.
//
//        Print the numbers 1-5
//        for(int x = 1; x <=5; x++) {
//            System.out.println(x);
//        }

////        Todo
////            You are given code that takes the number of students who
////            enter the university as input. Let's greet them!
////            Task
////            Complete the program to output "Welcome" for each student.
//            Scanner scanner = new Scanner(System.in);
//            int n = scanner.nextInt();
//            for(int i =0; i < n; i ++){
//                System.out.println("Welcome");
//            }
////Todo Print Great 10 times
//        for (int i = 0; i < 10; i ++){
//            System.out.println("Great");
//        }
//      Todo Print a for loop that prints even numbers
//         x is equal to 0, x is less than or equal to 10 -> 0-10.
//         x equals x plus 2 -> to keep displaying evens.
//
//        for(int x = 0; x <=10; x=x+2)
//            System.out.println(x);

//        System.out.println("Do While Loops");
//        int x = 1;
//        do {
//            System.out.println(x);
//            x++;
//        } while(x < 5);


//        will still run if the while is false
//        int x = 1;
//        do {
//            System.out.println(x);
//            x++;
//        } while(x < 0);

//        Todo Write a program that will continuously
//          take a password as input and output
//          Write password, until the client inserts the
//          correct password.

//        Scanner read = new Scanner(System.in);
//        int password;
//        do {
//            System.out.println("Write password");
//            password = read.nextInt();
//        }
//        while (password != 8819);


//        System.out.println("Break and Continue");
//        // TODO: Break - The break and continue statements change the loop's
//              execution flow.
//              The break statement terminates the loop and transfers
//              execution to the statement immediately following the loop.

//        int x = 1;
//
//        while(x > 0) {
//            System.out.println(x);
//            if(x == 4) {
//                break;
//            }
//            x++;
//        }


        // TODO CONTINUE: The continue statement causes the loop to skip the
        //  remainder of its body and then immediately retest its
        //  condition prior to reiterating. In other words, it makes the
        //  loop skip to its next iteration. 30 is skipped at the continue.

//        for(int x=10; x<=40; x=x+10) {
//            if(x == 30) {
//                continue;
//            }
//            System.out.println(x);
//        }

// TODO: Build a Loan Calculator - You take a loan from a friend and need
//  to calculate how much you will owe him after 3 months.
//  You are going to pay him back 10% of the remaining loan amount
//  each month.
//  Create a program that takes the loan amount as input, calculates
//  and outputs the remaining amount after 3 months.

//        Here is the monthly payment schedule:
//        Month 1
//        Payment: 10% of 20000 = 2000
//        Remaining amount: 18000
//        Month 2
//        Payment: 10% of 18000 = 1800
//        Remaining amount: 16200
//        Month 3:
//        Payment: 10% of 16200 = 1620
//        Remaining amount: 14580

        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        //your code goes here
        int remaining = amount;
        for (int x = 0;x < 3;x++) {
            amount -= ((amount * 10) / 100);
        };
        System.out.println(amount);


        }

}

