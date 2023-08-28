public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;       // изначально имеющаяся сумма на счете;
        int depositAmount = 1100;                            // сумма депозита;
        int bonus;                                         // бонусы;

        if (depositAmount >= 1000) {
            bonus = depositAmount / 100;
        } else {
            bonus = 0;
        }

        int totalBalance = initialBalance + depositAmount + bonus; // баланс c учетом бонусов;

        System.out.println(" Итоговый баланс с учетом бонусов " + totalBalance + " рублей ");
    }

}
