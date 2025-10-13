//    calculate Maximum number of chocolates can eat and Number of wrappers left in hand.
//    Money: Total money one has to spend.
//    Price: price per chocolate.
//            wrappers: minimum number of wrappers for exchange choco: number of chocolate for wrappers.
//    Max visit: Maximum number of times one can visit the shop.(if zero consider it infinite)
//    example: input: Money:40 Price:1 wrappers:3 choco:1 Max visit:1 Output: total chocolate can eat: 53 wrappers left in hand:14

public class ChocolateWrapper {
    public static void main(String[] args) {
        int money = 40;
        int price = 1;
        int wrappersNeeded = 3;
        int chocoPerExchange = 1;
        int maxVisit = 1; // 0 means infinite visits

        calculateChocolates(money, price, wrappersNeeded, chocoPerExchange, maxVisit);
    }

    public static void calculateChocolates(int money, int price, int wrappersNeeded, int chocoPerExchange, int maxVisit) {
        int chocolates = money / price; // initial chocolates
        int wrappers = chocolates;

        int visits = 0;

        // If maxVisit = 0 → infinite visits allowed
        while ((maxVisit == 0 || visits < maxVisit) && wrappers >= wrappersNeeded) {
            int newChocos = (wrappers / wrappersNeeded) * chocoPerExchange;
            chocolates += newChocos;
            wrappers = (wrappers % wrappersNeeded) + newChocos;
            visits++;
        }

        System.out.println("Total chocolates can eat: " + chocolates);
        System.out.println("Wrappers left in hand: " + wrappers);
    }
}
