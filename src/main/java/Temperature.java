public class Temperature {

    public static void main(String[] args) {

//    Представим, что у нас есть устройство, в котором две колбы.
//    Прибор работает корректно, если температура первой колбы выше 100 градусов,
//    а температура второй колбы меньше 100 градусов. Вы должны написать метод,
//    который проверяет это устройство. Ваша программа должна иметь переменные temperature1 и temperature2.
//    Метод принимает на вход две эти переменные и выводит в консоль true или false.


    int temperature1 = 101;
    int temperature2 = 99;

        System.out.println("Прибор работает корректно: " + isCorrectly(temperature1, temperature2));
}
    private static boolean isCorrectly(int t1, int t2) {
        if (t1 >= 100 && t2 <= 100) return true;
        else return false;
    }
}

