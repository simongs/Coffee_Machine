package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Write how many cups of coffee you will need:");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        System.out.println(String.format("For %d cups of coffee you will need:", data));
        System.out.println(String.format("%d ml of water", data * 200));
        System.out.println(String.format("%d ml of milk", data * 50));
        System.out.println(String.format("%d g of coffee beans", data * 15));
    }
}
