import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        System.out.println("If Statements");
//        TODO
//          You have $12,000 to buy a car.
//          You're given a program which takes the price of car as an input.
//          Task
//          Output "yes" if the price is lower than or equal to 12,000.
//           Sample Input
//           11000
//          Sample Output
//          yes
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        //complete the code

        if (price <= 12000) {
            System.out.println("yes");
        }
    }
}
