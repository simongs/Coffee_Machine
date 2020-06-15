package machine;

import java.util.Arrays;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        // 주어진 물의 양
        System.out.println("Write how many ml of water the coffee machine has:");
        Scanner sc = new Scanner(System.in);
        int water = sc.nextInt();

        // 주어진 우유의 양
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = sc.nextInt();

        // 주어진 커피콩 수
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int grams = sc.nextInt();

        // 뽑고 싶은 커피의 갯수
        System.out.println("Write how many cups of coffee you will need:");
        int coffee = sc.nextInt();

        int maximumCoffee = determineValues(water, milk, grams);

        if (coffee <= maximumCoffee) {
            if (coffee > 0) {
                System.out.println(String.format("Yes, I can make that amount of coffee (and even %d more than that)", maximumCoffee - coffee));
            } else {
                System.out.println("Yes, I can make that amount of coffee");
            }
        } else {
            System.out.println(String.format("No, I can make only %d cup(s) of coffee", maximumCoffee));
        }



        /*if (determineValues(water, milk, grams, coffee)) {
            System.out.println("Yes, I can make that amount of coffee (and even 2 more than that)");
        }*/

    }

    private static int determineValues(int water, int milk, int grams) {
        int maxByWater = water / 200;
        int maxByMilk = milk / 50;
        int maxByGrams = grams / 15;

        int[] arr = {maxByWater, maxByMilk, maxByGrams};
        return Arrays.stream(arr).min().getAsInt();

    }
}
