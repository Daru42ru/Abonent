public class Main {
    public static void main(String[] args) {

        int balance = 32; // Начальный баланс
        int refill = 1302; // Пополнение счёта
        int bonus = 100; // Стоимость 1 бонусного рубля
        int ruble = refill / bonus; // Бонусные рубли
        System.out.println("Ваш итоговый счёт:");
        System.out.println(balance + refill + ruble + " рублей");
        System.out.println("Вам начисленно:");
        System.out.println(ruble + " бонусных рублей");


    }
}