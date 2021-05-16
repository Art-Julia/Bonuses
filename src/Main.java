public class Main {
    public static void main(String[] args) {
        int InitialBalance = 20;
        int BalanceTopUp = 100;
        int bonus;
        if (BalanceTopUp >= 1_000){bonus = BalanceTopUp/100;
        } else  {bonus = 0;
        }
        int TotalBalance = InitialBalance + BalanceTopUp;
        System.out.println("Total account Balance");
        System.out.println(TotalBalance);
        System.out.println("Total Bonus");
        System.out.println(bonus);


    }
}
