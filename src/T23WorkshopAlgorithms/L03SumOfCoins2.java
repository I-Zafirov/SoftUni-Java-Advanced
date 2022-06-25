package T23WorkshopAlgorithms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class L03SumOfCoins2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().substring(7).split(", ");
        int[] coins = new int[elements.length];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = Integer.parseInt(elements[i]);
        }

        int targetSum = Integer.parseInt(scanner.nextLine().substring(5));

        Map<Integer, Integer> usedCoins = chooseCoins(coins, targetSum);

        for (Map.Entry<Integer, Integer> usedCoin : usedCoins.entrySet ()) {
            System.out.println (usedCoin.getKey () + " -> " + usedCoin.getValue ());
        }
    }

    private static Map<Integer, Integer> chooseCoins(int[] coins, int targetSum) {

        Map<Integer, Integer> result = new LinkedHashMap<>();
        for (int i = coins.length - 1; i >= 0 ; i--) {
            int currentCoin = coins[i];
            int coinsCount = targetSum / currentCoin;

            if (coinsCount != 0){
                result.put(currentCoin, coinsCount);
            }

            targetSum = targetSum % currentCoin;
            if (targetSum == 0){
                break;
            }
        }
        return result;
    }
}
