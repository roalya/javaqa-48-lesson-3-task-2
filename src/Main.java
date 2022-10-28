public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        int balance = 200;
        int addition = 1000;
        int amountPerBonus = 100;

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int bonus;

        if (addition > 1000) {
            bonus = addition / amountPerBonus;
        } else {
            bonus = 0;
        }

        int result = balance + addition + bonus;

        System.out.println("Баланс: " + balance + ", " + "сумма пополнения: " + addition + ", " + "бонусов: " + bonus + ", " + "итоговый баланс: " + result + ".");
    }
}