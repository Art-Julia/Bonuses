public class Main {
    public static void main(String[] args) {
        int initialBalance = 20;
        int balanceTopUp = 100;
        int bonus;
        if (balanceTopUp >= 1_000) {
            bonus = balanceTopUp / 100;
        } else {
            bonus = 0;
        }
        int TotalBalance = initialBalance + balanceTopUp;
        System.out.println("Total account Balance");
        System.out.println(TotalBalance);
        System.out.println("Total Bonus");
        System.out.println(bonus);


    }
}
