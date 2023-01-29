public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int bonus;
        int deposit = 100;
        int amount = 1500;

        if (amount > 1000) {
            bonus = amount / 100;
        } else {bonus = 0;}

        int total = amount + deposit + bonus;

        System.out.println("Общая сумма на счете:");
        System.out.println(total);
        System.out.println("в том числе бонус:");
        System.out.println(bonus);
    }
}