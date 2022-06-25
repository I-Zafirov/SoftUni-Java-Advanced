package T23WorkshopAlgorithms.L03SumOfCoins;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] elements = in.nextLine().substring(7).split(", ");
        int[] coins = new int[elements.length];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = Integer.parseInt(elements[i]);
        }

        int targetSum = Integer.parseInt(in.nextLine().substring(5));


        Map<Integer, Integer> usedCoins = chooseCoins(coins, targetSum);

        for (Map.Entry<Integer, Integer> usedCoin : usedCoins.entrySet()) {
            System.out.println(usedCoin.getKey() + " -> " + usedCoin.getValue());
        }
    }

    public static Map<Integer, Integer> chooseCoins(int[] coins, int targetSum) {
        // TODO
        Map<Integer, Integer> coinsCount = new LinkedHashMap<>();

        int index = coins.length - 1;

        while (targetSum > 0 && index >= 0) {
            int coin = coins[index];

            int coinsToTake = targetSum / coin;

            if (coinsToTake != 0) {
                coinsCount.put(coin, coinsToTake);
            }

            targetSum = targetSum % coin;
            index--;
        }

        return coinsCount;
    }
}
